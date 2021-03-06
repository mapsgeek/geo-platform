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
package org.geosdi.geoplatform.wfs;

import org.geosdi.geoplatform.connector.GPWFSConnectorStore;
import org.geosdi.geoplatform.connector.WFSConnectorBuilder;
import org.geosdi.geoplatform.connector.server.GPServerConnector;
import org.geosdi.geoplatform.connector.server.request.WFSDescribeFeatureTypeRequest;
import org.geosdi.geoplatform.jaxb.GPJAXBContextBuilder;
import org.geosdi.geoplatform.support.wfs.feature.reader.GPFeatureSchemaReader;
import org.geosdi.geoplatform.xml.xsd.v2001.Schema;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.namespace.QName;
import java.io.StringWriter;
import java.net.URL;
import java.util.Arrays;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
public class WFSDescribeFeatureTest {

    private static final Logger logger = LoggerFactory.getLogger(WFSDescribeFeatureTest.class);
    //
    private static final String wfsURL = "http://iterservice.regione.campania.it/geoserver/wfs";

    static {
        try {
            serverConnector = WFSConnectorBuilder.newConnector().withServerUrl(
                    new URL(wfsURL)).withPooledConnectorConfig(
                    new GPServerConnector.BasePooledConnectorConfig(150, 80)).build();
        } catch (Exception ex) {
            logger.error("#######################EXCEPTION : {}", ex.getMessage());
        }
    }

    //
    private static final QName statesName = new QName("itercampania:sciame");
    private static final QName sfRoads = new QName("sf:roads");
    //
    private static GPWFSConnectorStore serverConnector;
    private static final GPJAXBContextBuilder gpJAXBContextBuilder = GPJAXBContextBuilder.newInstance();

    @Test
    public void describeToppStatesTest() throws Exception {
        WFSDescribeFeatureTypeRequest<Schema> request = serverConnector.createDescribeFeatureTypeRequest();

        String localPart = statesName.getLocalPart();
        request.setTypeName(Arrays.asList(statesName));
        Schema s = request.getResponse();

        String name = localPart.substring(localPart.indexOf(":") + 1);
        StringWriter writer = new StringWriter();
        gpJAXBContextBuilder.marshal(new GPFeatureSchemaReader().getFeature(s, name), writer);

        logger.info("######################LAYER_SCHEMA_TOPP_STATES_XML : {}\n", writer);
    }

    @Test
    public void describeSFRoadTest() throws Exception {
        WFSDescribeFeatureTypeRequest<Schema> request = serverConnector.createDescribeFeatureTypeRequest();

        String localPart = sfRoads.getLocalPart();
        request.setTypeName(Arrays.asList(sfRoads));
        Schema s = request.getResponse();

        String name = localPart.substring(localPart.indexOf(":") + 1);
        StringWriter writer = new StringWriter();
        gpJAXBContextBuilder.marshal(new GPFeatureSchemaReader().getFeature(s, name), writer);

        logger.info("######################LAYER_SCHEMA_SF_ROAD_XML : {}\n", writer);
    }
}
