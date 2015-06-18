//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.17 at 04:41:23 PM CEST 
//


package org.geosdi.geoplatform.xml.iso19139.v20060504.gmx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.geosdi.geoplatform.xml.gml.v320.PassThroughOperationType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for ML_PassThroughOperation_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ML_PassThroughOperation_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}PassThroughOperationType">
 *       &lt;sequence>
 *         &lt;element name="alternativeExpression" type="{http://www.isotc211.org/2005/gmx}OperationAlt_PropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ML_PassThroughOperation_Type", propOrder = {
    "alternativeExpression"
})
public class MLPassThroughOperationType
    extends PassThroughOperationType
    implements ToString
{

    @XmlElement(required = true)
    protected List<OperationAltPropertyType> alternativeExpression;

    /**
     * Gets the value of the alternativeExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationAltPropertyType }
     * 
     * 
     */
    public List<OperationAltPropertyType> getAlternativeExpression() {
        if (alternativeExpression == null) {
            alternativeExpression = new ArrayList<OperationAltPropertyType>();
        }
        return this.alternativeExpression;
    }

    public boolean isSetAlternativeExpression() {
        return ((this.alternativeExpression!= null)&&(!this.alternativeExpression.isEmpty()));
    }

    public void unsetAlternativeExpression() {
        this.alternativeExpression = null;
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
            List<OperationAltPropertyType> theAlternativeExpression;
            theAlternativeExpression = (this.isSetAlternativeExpression()?this.getAlternativeExpression():null);
            strategy.appendField(locator, this, "alternativeExpression", buffer, theAlternativeExpression);
        }
        return buffer;
    }

    public void setAlternativeExpression(List<OperationAltPropertyType> value) {
        this.alternativeExpression = null;
        List<OperationAltPropertyType> draftl = this.getAlternativeExpression();
        draftl.addAll(value);
    }

}
