//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.17 at 04:41:23 PM CEST 
//


package org.geosdi.geoplatform.xml.iso19139.v20060504.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gco.AbstractObjectType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmx.MXAggregateType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * Identifiable collection of datasets
 * 
 * <p>Java class for AbstractDS_Aggregate_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractDS_Aggregate_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="composedOf" type="{http://www.isotc211.org/2005/gmd}DS_DataSet_PropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="seriesMetadata" type="{http://www.isotc211.org/2005/gmd}MD_Metadata_PropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="subset" type="{http://www.isotc211.org/2005/gmd}DS_Aggregate_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="superset" type="{http://www.isotc211.org/2005/gmd}DS_Aggregate_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDS_Aggregate_Type", propOrder = {
    "composedOf",
    "seriesMetadata",
    "subset",
    "superset"
})
@XmlSeeAlso({
    DSInitiativeType.class,
    DSSeriesType.class,
    DSOtherAggregateType.class,
    MXAggregateType.class
})
public abstract class AbstractDSAggregateType
    extends AbstractObjectType
    implements ToString
{

    @XmlElement(required = true)
    protected List<DSDataSetPropertyType> composedOf;
    @XmlElement(required = true)
    protected List<MDMetadataPropertyType> seriesMetadata;
    protected List<DSAggregatePropertyType> subset;
    protected List<DSAggregatePropertyType> superset;

    /**
     * Gets the value of the composedOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the composedOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComposedOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSDataSetPropertyType }
     * 
     * 
     */
    public List<DSDataSetPropertyType> getComposedOf() {
        if (composedOf == null) {
            composedOf = new ArrayList<DSDataSetPropertyType>();
        }
        return this.composedOf;
    }

    public boolean isSetComposedOf() {
        return ((this.composedOf!= null)&&(!this.composedOf.isEmpty()));
    }

    public void unsetComposedOf() {
        this.composedOf = null;
    }

    /**
     * Gets the value of the seriesMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seriesMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeriesMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDMetadataPropertyType }
     * 
     * 
     */
    public List<MDMetadataPropertyType> getSeriesMetadata() {
        if (seriesMetadata == null) {
            seriesMetadata = new ArrayList<MDMetadataPropertyType>();
        }
        return this.seriesMetadata;
    }

    public boolean isSetSeriesMetadata() {
        return ((this.seriesMetadata!= null)&&(!this.seriesMetadata.isEmpty()));
    }

    public void unsetSeriesMetadata() {
        this.seriesMetadata = null;
    }

    /**
     * Gets the value of the subset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSAggregatePropertyType }
     * 
     * 
     */
    public List<DSAggregatePropertyType> getSubset() {
        if (subset == null) {
            subset = new ArrayList<DSAggregatePropertyType>();
        }
        return this.subset;
    }

    public boolean isSetSubset() {
        return ((this.subset!= null)&&(!this.subset.isEmpty()));
    }

    public void unsetSubset() {
        this.subset = null;
    }

    /**
     * Gets the value of the superset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the superset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuperset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSAggregatePropertyType }
     * 
     * 
     */
    public List<DSAggregatePropertyType> getSuperset() {
        if (superset == null) {
            superset = new ArrayList<DSAggregatePropertyType>();
        }
        return this.superset;
    }

    public boolean isSetSuperset() {
        return ((this.superset!= null)&&(!this.superset.isEmpty()));
    }

    public void unsetSuperset() {
        this.superset = null;
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
            List<DSDataSetPropertyType> theComposedOf;
            theComposedOf = (this.isSetComposedOf()?this.getComposedOf():null);
            strategy.appendField(locator, this, "composedOf", buffer, theComposedOf);
        }
        {
            List<MDMetadataPropertyType> theSeriesMetadata;
            theSeriesMetadata = (this.isSetSeriesMetadata()?this.getSeriesMetadata():null);
            strategy.appendField(locator, this, "seriesMetadata", buffer, theSeriesMetadata);
        }
        {
            List<DSAggregatePropertyType> theSubset;
            theSubset = (this.isSetSubset()?this.getSubset():null);
            strategy.appendField(locator, this, "subset", buffer, theSubset);
        }
        {
            List<DSAggregatePropertyType> theSuperset;
            theSuperset = (this.isSetSuperset()?this.getSuperset():null);
            strategy.appendField(locator, this, "superset", buffer, theSuperset);
        }
        return buffer;
    }

    public void setComposedOf(List<DSDataSetPropertyType> value) {
        this.composedOf = null;
        List<DSDataSetPropertyType> draftl = this.getComposedOf();
        draftl.addAll(value);
    }

    public void setSeriesMetadata(List<MDMetadataPropertyType> value) {
        this.seriesMetadata = null;
        List<MDMetadataPropertyType> draftl = this.getSeriesMetadata();
        draftl.addAll(value);
    }

    public void setSubset(List<DSAggregatePropertyType> value) {
        this.subset = null;
        List<DSAggregatePropertyType> draftl = this.getSubset();
        draftl.addAll(value);
    }

    public void setSuperset(List<DSAggregatePropertyType> value) {
        this.superset = null;
        List<DSAggregatePropertyType> draftl = this.getSuperset();
        draftl.addAll(value);
    }

}
