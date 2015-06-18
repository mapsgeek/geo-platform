//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.17 at 04:41:23 PM CEST 
//


package org.geosdi.geoplatform.xml.iso19139.v20060504.src;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gco.AbstractObjectType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for SV_Service_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SV_Service_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="specification" type="{http://www.isotc211.org/2005/srv}SV_PlatformSpecificServiceSpecification_PropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="theSV_Port" type="{http://www.isotc211.org/2005/srv}SV_Port_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SV_Service_Type", propOrder = {
    "specification",
    "theSVPort"
})
public class SVServiceType
    extends AbstractObjectType
    implements ToString
{

    @XmlElement(required = true)
    protected List<SVPlatformSpecificServiceSpecificationPropertyType> specification;
    @XmlElement(name = "theSV_Port")
    protected List<SVPortPropertyType> theSVPort;

    /**
     * Gets the value of the specification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SVPlatformSpecificServiceSpecificationPropertyType }
     * 
     * 
     */
    public List<SVPlatformSpecificServiceSpecificationPropertyType> getSpecification() {
        if (specification == null) {
            specification = new ArrayList<SVPlatformSpecificServiceSpecificationPropertyType>();
        }
        return this.specification;
    }

    public boolean isSetSpecification() {
        return ((this.specification!= null)&&(!this.specification.isEmpty()));
    }

    public void unsetSpecification() {
        this.specification = null;
    }

    /**
     * Gets the value of the theSVPort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the theSVPort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTheSVPort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SVPortPropertyType }
     * 
     * 
     */
    public List<SVPortPropertyType> getTheSVPort() {
        if (theSVPort == null) {
            theSVPort = new ArrayList<SVPortPropertyType>();
        }
        return this.theSVPort;
    }

    public boolean isSetTheSVPort() {
        return ((this.theSVPort!= null)&&(!this.theSVPort.isEmpty()));
    }

    public void unsetTheSVPort() {
        this.theSVPort = null;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            List<SVPlatformSpecificServiceSpecificationPropertyType> theSpecification;
            theSpecification = (this.isSetSpecification()?this.getSpecification():null);
            strategy.appendField(locator, this, "specification", buffer, theSpecification);
        }
        {
            List<SVPortPropertyType> theTheSVPort;
            theTheSVPort = (this.isSetTheSVPort()?this.getTheSVPort():null);
            strategy.appendField(locator, this, "theSVPort", buffer, theTheSVPort);
        }
        return buffer;
    }

    public void setSpecification(List<SVPlatformSpecificServiceSpecificationPropertyType> value) {
        this.specification = null;
        List<SVPlatformSpecificServiceSpecificationPropertyType> draftl = this.getSpecification();
        draftl.addAll(value);
    }

    public void setTheSVPort(List<SVPortPropertyType> value) {
        this.theSVPort = null;
        List<SVPortPropertyType> draftl = this.getTheSVPort();
        draftl.addAll(value);
    }

}