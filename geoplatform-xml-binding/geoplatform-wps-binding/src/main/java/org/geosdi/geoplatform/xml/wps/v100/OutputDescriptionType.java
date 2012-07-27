//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.16 at 12:48:05 PM CEST 
//


package org.geosdi.geoplatform.xml.wps.v100;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * Description of a process Output. 
 * 
 * In this use, the DescriptionType shall describe this process output. 
 * 
 * <p>Java class for OutputDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutputDescriptionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/wps/1.0.0}DescriptionType">
 *       &lt;group ref="{http://www.opengis.net/wps/1.0.0}OutputFormChoice"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputDescriptionType", propOrder = {
    "complexOutput",
    "literalOutput",
    "boundingBoxOutput"
})
public class OutputDescriptionType
    extends DescriptionType
    implements ToString
{

    @XmlElement(name = "ComplexOutput", namespace = "")
    protected SupportedComplexDataType complexOutput;
    @XmlElement(name = "LiteralOutput", namespace = "")
    protected LiteralOutputType literalOutput;
    @XmlElement(name = "BoundingBoxOutput", namespace = "")
    protected SupportedCRSsType boundingBoxOutput;

    /**
     * Gets the value of the complexOutput property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedComplexDataType }
     *     
     */
    public SupportedComplexDataType getComplexOutput() {
        return complexOutput;
    }

    /**
     * Sets the value of the complexOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedComplexDataType }
     *     
     */
    public void setComplexOutput(SupportedComplexDataType value) {
        this.complexOutput = value;
    }

    public boolean isSetComplexOutput() {
        return (this.complexOutput!= null);
    }

    /**
     * Gets the value of the literalOutput property.
     * 
     * @return
     *     possible object is
     *     {@link LiteralOutputType }
     *     
     */
    public LiteralOutputType getLiteralOutput() {
        return literalOutput;
    }

    /**
     * Sets the value of the literalOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiteralOutputType }
     *     
     */
    public void setLiteralOutput(LiteralOutputType value) {
        this.literalOutput = value;
    }

    public boolean isSetLiteralOutput() {
        return (this.literalOutput!= null);
    }

    /**
     * Gets the value of the boundingBoxOutput property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedCRSsType }
     *     
     */
    public SupportedCRSsType getBoundingBoxOutput() {
        return boundingBoxOutput;
    }

    /**
     * Sets the value of the boundingBoxOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedCRSsType }
     *     
     */
    public void setBoundingBoxOutput(SupportedCRSsType value) {
        this.boundingBoxOutput = value;
    }

    public boolean isSetBoundingBoxOutput() {
        return (this.boundingBoxOutput!= null);
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
            SupportedComplexDataType theComplexOutput;
            theComplexOutput = this.getComplexOutput();
            strategy.appendField(locator, this, "complexOutput", buffer, theComplexOutput);
        }
        {
            LiteralOutputType theLiteralOutput;
            theLiteralOutput = this.getLiteralOutput();
            strategy.appendField(locator, this, "literalOutput", buffer, theLiteralOutput);
        }
        {
            SupportedCRSsType theBoundingBoxOutput;
            theBoundingBoxOutput = this.getBoundingBoxOutput();
            strategy.appendField(locator, this, "boundingBoxOutput", buffer, theBoundingBoxOutput);
        }
        return buffer;
    }

}