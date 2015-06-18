//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.06.18 alle 12:52:42 AM CEST 
//


package org.geosdi.geoplatform.xml.gml.v320;

import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBMergeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.MergeFrom;
import org.jvnet.jaxb2_commons.lang.MergeStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Classe Java per TemporalDatumType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TemporalDatumType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}TemporalDatumBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}origin"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemporalDatumType", propOrder = {
    "origin"
})
public class TemporalDatumType
    extends TemporalDatumBaseType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar origin;

    /**
     * Recupera il valore della proprietà origin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrigin() {
        return origin;
    }

    /**
     * Imposta il valore della proprietà origin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrigin(XMLGregorianCalendar value) {
        this.origin = value;
    }

    public boolean isSetOrigin() {
        return (this.origin!= null);
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
            XMLGregorianCalendar theOrigin;
            theOrigin = this.getOrigin();
            strategy.appendField(locator, this, "origin", buffer, theOrigin);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TemporalDatumType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TemporalDatumType that = ((TemporalDatumType) object);
        {
            XMLGregorianCalendar lhsOrigin;
            lhsOrigin = this.getOrigin();
            XMLGregorianCalendar rhsOrigin;
            rhsOrigin = that.getOrigin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "origin", lhsOrigin), LocatorUtils.property(thatLocator, "origin", rhsOrigin), lhsOrigin, rhsOrigin)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            XMLGregorianCalendar theOrigin;
            theOrigin = this.getOrigin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "origin", theOrigin), currentHashCode, theOrigin);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof TemporalDatumType) {
            final TemporalDatumType copy = ((TemporalDatumType) draftCopy);
            if (this.isSetOrigin()) {
                XMLGregorianCalendar sourceOrigin;
                sourceOrigin = this.getOrigin();
                XMLGregorianCalendar copyOrigin = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "origin", sourceOrigin), sourceOrigin));
                copy.setOrigin(copyOrigin);
            } else {
                copy.origin = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TemporalDatumType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof TemporalDatumType) {
            final TemporalDatumType target = this;
            final TemporalDatumType leftObject = ((TemporalDatumType) left);
            final TemporalDatumType rightObject = ((TemporalDatumType) right);
            {
                XMLGregorianCalendar lhsOrigin;
                lhsOrigin = leftObject.getOrigin();
                XMLGregorianCalendar rhsOrigin;
                rhsOrigin = rightObject.getOrigin();
                target.setOrigin(((XMLGregorianCalendar) strategy.merge(LocatorUtils.property(leftLocator, "origin", lhsOrigin), LocatorUtils.property(rightLocator, "origin", rhsOrigin), lhsOrigin, rhsOrigin)));
            }
        }
    }

    public TemporalDatumType withOrigin(XMLGregorianCalendar value) {
        setOrigin(value);
        return this;
    }

    @Override
    public TemporalDatumType withDomainOfValidity(DomainOfValidityElement value) {
        setDomainOfValidity(value);
        return this;
    }

    @Override
    public TemporalDatumType withScope(String... values) {
        if (values!= null) {
            for (String value: values) {
                getScope().add(value);
            }
        }
        return this;
    }

    @Override
    public TemporalDatumType withScope(Collection<String> values) {
        if (values!= null) {
            getScope().addAll(values);
        }
        return this;
    }

    @Override
    public TemporalDatumType withAnchorDefinition(JAXBElement<CodeType> value) {
        setAnchorDefinition(value);
        return this;
    }

    @Override
    public TemporalDatumType withRealizationEpoch(XMLGregorianCalendar value) {
        setRealizationEpoch(value);
        return this;
    }

    @Override
    public TemporalDatumType withScope(List<String> value) {
        setScope(value);
        return this;
    }

    @Override
    public TemporalDatumType withRemarks(String value) {
        setRemarks(value);
        return this;
    }

    @Override
    public TemporalDatumType withMetaDataProperty(MetaDataPropertyType... values) {
        if (values!= null) {
            for (MetaDataPropertyType value: values) {
                getMetaDataProperty().add(value);
            }
        }
        return this;
    }

    @Override
    public TemporalDatumType withMetaDataProperty(Collection<MetaDataPropertyType> values) {
        if (values!= null) {
            getMetaDataProperty().addAll(values);
        }
        return this;
    }

    @Override
    public TemporalDatumType withDescription(StringOrRefType value) {
        setDescription(value);
        return this;
    }

    @Override
    public TemporalDatumType withDescriptionReference(ReferenceType value) {
        setDescriptionReference(value);
        return this;
    }

    @Override
    public TemporalDatumType withIdentifier(CodeWithAuthorityType value) {
        setIdentifier(value);
        return this;
    }

    @Override
    public TemporalDatumType withName(CodeType... values) {
        if (values!= null) {
            for (CodeType value: values) {
                getName().add(value);
            }
        }
        return this;
    }

    @Override
    public TemporalDatumType withName(Collection<CodeType> values) {
        if (values!= null) {
            getName().addAll(values);
        }
        return this;
    }

    @Override
    public TemporalDatumType withId(String value) {
        setId(value);
        return this;
    }

    @Override
    public TemporalDatumType withMetaDataProperty(List<MetaDataPropertyType> value) {
        setMetaDataProperty(value);
        return this;
    }

    @Override
    public TemporalDatumType withName(List<CodeType> value) {
        setName(value);
        return this;
    }

}