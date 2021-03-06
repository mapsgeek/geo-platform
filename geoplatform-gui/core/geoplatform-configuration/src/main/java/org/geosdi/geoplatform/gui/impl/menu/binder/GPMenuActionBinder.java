/**
 *
 *    geo-platform
 *    Rich webgis framework
 *    http://geo-platform.org
 *   ====================================================================
 *
 *   Copyright (C) 2008-2016 geoSDI Group (CNR IMAA - Potenza - ITALY).
 *
 *   This program is free software: you can redistribute it and/or modify it
 *   under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version. This program is distributed in the
 *   hope that it will be useful, but WITHOUT ANY WARRANTY; without
 *   even the implied warranty of MERCHANTABILITY or FITNESS FOR
 *   A PARTICULAR PURPOSE. See the GNU General Public License
 *   for more details. You should have received a copy of the GNU General
 *   Public License along with this program. If not, see http://www.gnu.org/licenses/
 *
 *   ====================================================================
 *
 *   Linking this library statically or dynamically with other modules is
 *   making a combined work based on this library. Thus, the terms and
 *   conditions of the GNU General Public License cover the whole combination.
 *
 *   As a special exception, the copyright holders of this library give you permission
 *   to link this library with independent modules to produce an executable, regardless
 *   of the license terms of these independent modules, and to copy and distribute
 *   the resulting executable under terms of your choice, provided that you also meet,
 *   for each linked independent module, the terms and conditions of the license of
 *   that module. An independent module is a module which is not derived from or
 *   based on this library. If you modify this library, you may extend this exception
 *   to your version of the library, but you are not obligated to do so. If you do not
 *   wish to do so, delete this exception statement from your version.
 */
package org.geosdi.geoplatform.gui.impl.menu.binder;

import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.MenuEvent;
import com.extjs.gxt.ui.client.widget.menu.CheckMenuItem;
import com.extjs.gxt.ui.client.widget.menu.Menu;
import com.extjs.gxt.ui.client.widget.menu.MenuItem;
import java.util.List;
import org.geosdi.geoplatform.gui.action.menu.MenuAction;
import org.geosdi.geoplatform.gui.action.menu.MenuBaseAction;
import org.geosdi.geoplatform.gui.action.menu.MenuCheckAction;
import org.geosdi.geoplatform.gui.action.menu.event.MenuActionChangeCheckEvent;
import org.geosdi.geoplatform.gui.action.menu.handler.MenuActionChangeCheckHandler;
import org.geosdi.geoplatform.gui.configuration.GPCheckMenuItem;
import org.geosdi.geoplatform.gui.configuration.GPGroupMenuItem;
import org.geosdi.geoplatform.gui.configuration.GPMenuGenericTool;
import org.geosdi.geoplatform.gui.configuration.GPMenuItem;
import org.geosdi.geoplatform.gui.configuration.GeoPlatformMenuCreator;
import org.geosdi.geoplatform.gui.configuration.action.event.ActionEnableEvent;
import org.geosdi.geoplatform.gui.configuration.action.event.ActionEnableHandler;

/**
 *
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
public class GPMenuActionBinder implements MenuActionBinder {

    private final GeoPlatformMenuCreator menuCreator;

    public GPMenuActionBinder(GeoPlatformMenuCreator theMenuCreator) {
        this.menuCreator = theMenuCreator;
    }

    @Override
    public void bindTools(Menu menu,
            List<? extends GPMenuGenericTool> tools) {
        for (GPMenuGenericTool tool : tools) {
            tool.buildTool(menuCreator, menu);
        }
    }

    @Override
    public void bindMenuBaseAction(MenuAction action,
            GPMenuItem tool, final Menu menu) {
        final MenuItem item = new MenuItem(tool.getText());
        item.setItemId(tool.getId());
        
        if (action != null) {
            action.setId(tool.getId());
            if (action instanceof MenuBaseAction) {
                item.setIcon(((MenuBaseAction) action).getImage());
            }
            item.addSelectionListener(action);

            this.addMenuActionEnableHandler(action, item);

            action.setEnabled((action.isMustBeEnabled())
                    ? action.isMustBeEnabled() : tool.isEnabled());
        }

        menu.add(item);
    }

    @Override
    public void bindMenuCheckAction(MenuCheckAction action,
            GPCheckMenuItem tool,
            final Menu menu) {
        final CheckMenuItem item = new CheckMenuItem(tool.getText());
        item.setItemId(tool.getId());

        menu.add(item);

        if (action != null) {
            action.setId(tool.getId());
            item.addSelectionListener(action);

            this.addMenuActionEnableHandler(action, item);

            action.addMenuActionChangeCheckHandler(
                    new MenuActionChangeCheckHandler() {

                        @Override
                        public void onActionCheckChange(
                                MenuActionChangeCheckEvent event) {
                                    item.setChecked(event.isCheck());
                                    item.fireEvent(Events.Select, new MenuEvent(
                                                    menu, item));
                                }

                    });

            action.setChecked(tool.isChecked());
            action.setEnabled(tool.isEnabled());
        }
    }

    @Override
    public void bindGroupMenuItem(GPGroupMenuItem tool,
            Menu menu) {
        MenuItem item = new MenuItem(tool.getText());
        menu.add(item);
        Menu subMenu = new Menu();
        this.bindTools(subMenu, tool.getTools());
        item.setSubMenu(subMenu);
    }

    @Override
    public void addMenuActionEnableHandler(MenuAction action,
            final MenuItem item) {
        action.addActionEnableHandler(new ActionEnableHandler() {

            @Override
            public void onActionEnabled(ActionEnableEvent event) {
                item.setEnabled(event.isEnabled());
            }

        });
    }

}
