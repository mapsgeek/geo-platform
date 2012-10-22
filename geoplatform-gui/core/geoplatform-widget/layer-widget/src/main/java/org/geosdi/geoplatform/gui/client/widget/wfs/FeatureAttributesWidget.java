/*
 *  geo-platform
 *  Rich webgis framework
 *  http://geo-platform.org
 * ====================================================================
 *
 * Copyright (C) 2008-2012 geoSDI Group (CNR IMAA - Potenza - ITALY).
 *
 * This program is free software: you can redistribute it and/or modify it 
 * under the terms of the GNU General Public License as published by 
 * the Free Software Foundation, either version 3 of the License, or 
 * (at your option) any later version. This program is distributed in the 
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without 
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR 
 * A PARTICULAR PURPOSE. See the GNU General Public License 
 * for more details. You should have received a copy of the GNU General 
 * Public License along with this program. If not, see http://www.gnu.org/licenses/ 
 *
 * ====================================================================
 *
 * Linking this library statically or dynamically with other modules is 
 * making a combined work based on this library. Thus, the terms and 
 * conditions of the GNU General Public License cover the whole combination. 
 * 
 * As a special exception, the copyright holders of this library give you permission 
 * to link this library with independent modules to produce an executable, regardless 
 * of the license terms of these independent modules, and to copy and distribute 
 * the resulting executable under terms of your choice, provided that you also meet, 
 * for each linked independent module, the terms and conditions of the license of 
 * that module. An independent module is a module which is not derived from or 
 * based on this library. If you modify this library, you may extend this exception 
 * to your version of the library, but you are not obligated to do so. If you do not 
 * wish to do so, delete this exception statement from your version. 
 *
 */
package org.geosdi.geoplatform.gui.client.widget.wfs;

import com.extjs.gxt.ui.client.Style;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.store.StoreEvent;
import com.extjs.gxt.ui.client.store.StoreListener;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.grid.CellEditor;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.EditorGrid;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.geosdi.geoplatform.gui.client.BasicWidgetResources;
import org.geosdi.geoplatform.gui.client.model.wfs.AttributeDetail;
import org.geosdi.geoplatform.gui.client.model.wfs.AttributeDetail.AttributeDetailKeyValue;
import org.geosdi.geoplatform.gui.client.widget.GeoPlatformContentPanel;
import org.geosdi.geoplatform.gui.puregwt.GPEventBus;

/**
 *
 * @author Vincenzo Monteverde <vincenzo.monteverde@geosdi.org>
 */
public class FeatureAttributesWidget extends GeoPlatformContentPanel {

    private GPEventBus bus;
    //
    private String featureID;
    private List<AttributeDetail> attributes;
    //
    private ListStore<AttributeDetail> store;
    private EditorGrid<AttributeDetail> grid;
    //
    private Button saveButton;
    private Button resetButton;

    @Inject
    public FeatureAttributesWidget(GPEventBus bus) {
        super(true);
        this.bus = bus;
    }

    public void setFeatureID(String featureID) {
        assert (featureID != null) : "FeatureID must not bu null.";
        this.featureID = featureID;
    }

    public void setAttributes(List<AttributeDetail> attributes) {
        assert (attributes != null) : "Attributes must not bu null.";
        this.attributes = attributes;
    }

    @Override
    public void addComponent() {
        this.createStore();
        this.createEditorGrid();
        this.createButtons();
    }

    @Override
    public void initSize() {
    }

    @Override
    public void setPanelProperties() {
        super.head.setText("Feature Attributes");
        super.head.setStyleAttribute("textAlign", "center");
    }

    @Override
    public void reset() {
        store.removeAll();
        disableButtons();
        // TODO reset status bar
    }

    private void createStore() {
        store = new ListStore<AttributeDetail>();
        store.addStoreListener(new StoreListener<AttributeDetail>() {
            @Override
            public void storeClear(StoreEvent<AttributeDetail> se) {
                disableButtons();
            }

            @Override
            public void storeUpdate(StoreEvent<AttributeDetail> se) {
                enableButtons();
            }
        });
    }

    private void createEditorGrid() {
        grid = new EditorGrid<AttributeDetail>(store, this.prepareColumnModel());
        grid.setBorders(true);
        grid.setStripeRows(true);
        grid.setAutoExpandColumn(AttributeDetailKeyValue.NAME.toString());

        super.add(grid);
    }

    public ColumnModel prepareColumnModel() {
        List<ColumnConfig> configs = new ArrayList<ColumnConfig>();

        ColumnConfig nameColumn = new ColumnConfig();
        nameColumn.setId(AttributeDetailKeyValue.NAME.toString());
        nameColumn.setHeader("Name");
        nameColumn.setFixed(true);
        configs.add(nameColumn);

        TextField<String> valueTextField = new TextField<String>();
        valueTextField.setAllowBlank(false);
        CellEditor valueEditor = new CellEditor(valueTextField) {
            @Override
            public Object preProcessValue(Object value) { // TODO DEL
                if (value == null) {
                    return value;
                }
                // TODO Obtain the type of the value
                // Information aviable into DescribeFeatureType [XMLSchema]
                System.out.println("\n................. " + value.getClass());
                return value;
            }

            @Override
            public Object postProcessValue(Object value) {
                if (value == null) {
                    return value;
                }
                // TODO Validate the value wrt the type
                System.out.println("\n................. " + value.getClass());
                return value;
            }
        };

        ColumnConfig valueColumn = new ColumnConfig();
        valueColumn.setId(AttributeDetailKeyValue.VALUE.toString());
        valueColumn.setHeader("Value");
        valueColumn.setWidth(150);
        valueColumn.setFixed(true);
        valueColumn.setEditor(valueEditor);
        configs.add(valueColumn);

        return new ColumnModel(configs);
    }

    private void createButtons() {
        super.setButtonAlign(Style.HorizontalAlignment.CENTER);

        resetButton = new Button("Reset", BasicWidgetResources.ICONS.delete(),
                                 new SelectionListener<ButtonEvent>() {
            @Override
            public void componentSelected(ButtonEvent ce) {
                grid.stopEditing(true);
                store.rejectChanges();
                disableButtons();
            }
        });
        super.addButton(resetButton);

        this.saveButton = new Button("Save", BasicWidgetResources.ICONS.done(),
                                     new SelectionListener<ButtonEvent>() {
            @Override
            public void componentSelected(ButtonEvent ce) {
                saveAttributes();
            }
        });
        super.addButton(saveButton);
        this.disableButtons();
    }

    public void disableButtons() {
        resetButton.disable();
        saveButton.disable();
    }

    public void enableButtons() {
        resetButton.enable();
        saveButton.enable();
    }

    private void saveAttributes() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
