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
package org.geosdi.geoplatform.gml.api.jaxb.context.pool;

import org.w3c.dom.Node;

import javax.xml.bind.JAXBElement;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.Source;
import java.io.File;
import java.io.Reader;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
public interface IGMLJAXBContextPooled {

    // <editor-fold defaultstate="collapsed" desc="Unmarshaller Section">
    // ==========================================================================
    // === Unmarshaller Section
    // ==========================================================================
    <T> T unmarshal(File file) throws Exception;

    <T> T unmarshal(java.io.InputStream is) throws Exception;

    <T> T unmarshal(Reader reader) throws Exception;

    <T> T unmarshal(java.net.URL url) throws Exception;

    <T> T unmarshal(org.xml.sax.InputSource source) throws Exception;

    <T> T unmarshal(org.w3c.dom.Node node) throws Exception;

    <T> T unmarshal(javax.xml.transform.Source source) throws Exception;

    <T> T unmarshal(javax.xml.stream.XMLStreamReader reader) throws Exception;

    <T> T unmarshal(javax.xml.stream.XMLEventReader reader) throws Exception;

    <T> JAXBElement<T> unmarshal(Node node, Class<T> declaredType) throws Exception;

    <T> JAXBElement<T> unmarshal(Source source, Class<T> declaredType) throws Exception;

    <T> JAXBElement<T> unmarshal(XMLStreamReader reader, Class<T> declaredType) throws Exception;

    <T> JAXBElement<T> unmarshal(XMLEventReader reader, Class<T> declaredType) throws Exception;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Marshaller Section">
    // ==========================================================================
    // === Marshaller Section
    // ==========================================================================
    void marshal(Object jaxbElement, javax.xml.transform.Result result) throws Exception;

    void marshal(Object jaxbElement, java.io.OutputStream os)
            throws Exception;

    void marshal(Object jaxbElement, File output) throws Exception;

    void marshal(Object jaxbElement, java.io.Writer writer) throws Exception;

    void marshal(Object jaxbElement, org.xml.sax.ContentHandler handler)
            throws Exception;

    void marshal(Object jaxbElement, org.w3c.dom.Node node) throws Exception;

    void marshal(Object jaxbElement, javax.xml.stream.XMLStreamWriter writer)
            throws Exception;

    void marshal(Object jaxbElement, javax.xml.stream.XMLEventWriter writer)
            throws Exception;
    // </editor-fold>
}
