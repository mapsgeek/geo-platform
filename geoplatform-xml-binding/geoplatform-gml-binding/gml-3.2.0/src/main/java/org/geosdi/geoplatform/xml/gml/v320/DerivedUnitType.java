//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.06.18 alle 12:52:42 AM CEST 
//


package org.geosdi.geoplatform.xml.gml.v320;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Classe Java per DerivedUnitType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DerivedUnitType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}UnitDefinitionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}derivationUnitTerm" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivedUnitType", propOrder = {
    "derivationUnitTerm"
})
public class DerivedUnitType
    extends UnitDefinitionType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected List<DerivationUnitTermType> derivationUnitTerm;

    /**
     * Gets the value of the derivationUnitTerm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the derivationUnitTerm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDerivationUnitTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DerivationUnitTermType }
     * 
     * 
     */
    public List<DerivationUnitTermType> getDerivationUnitTerm() {
        if (derivationUnitTerm == null) {
            derivationUnitTerm = new ArrayList<DerivationUnitTermType>();
        }
        return this.derivationUnitTerm;
    }

    public boolean isSetDerivationUnitTerm() {
        return ((this.derivationUnitTerm!= null)&&(!this.derivationUnitTerm.isEmpty()));
    }

    public void unsetDerivationUnitTerm() {
        this.derivationUnitTerm = null;
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
            List<DerivationUnitTermType> theDerivationUnitTerm;
            theDerivationUnitTerm = this.getDerivationUnitTerm();
            strategy.appendField(locator, this, "derivationUnitTerm", buffer, theDerivationUnitTerm);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DerivedUnitType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DerivedUnitType that = ((DerivedUnitType) object);
        {
            List<DerivationUnitTermType> lhsDerivationUnitTerm;
            lhsDerivationUnitTerm = this.getDerivationUnitTerm();
            List<DerivationUnitTermType> rhsDerivationUnitTerm;
            rhsDerivationUnitTerm = that.getDerivationUnitTerm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "derivationUnitTerm", lhsDerivationUnitTerm), LocatorUtils.property(thatLocator, "derivationUnitTerm", rhsDerivationUnitTerm), lhsDerivationUnitTerm, rhsDerivationUnitTerm)) {
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
            List<DerivationUnitTermType> theDerivationUnitTerm;
            theDerivationUnitTerm = this.getDerivationUnitTerm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "derivationUnitTerm", theDerivationUnitTerm), currentHashCode, theDerivationUnitTerm);
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
        if (draftCopy instanceof DerivedUnitType) {
            final DerivedUnitType copy = ((DerivedUnitType) draftCopy);
            if (this.isSetDerivationUnitTerm()) {
                List<DerivationUnitTermType> sourceDerivationUnitTerm;
                sourceDerivationUnitTerm = this.getDerivationUnitTerm();
                @SuppressWarnings("unchecked")
                List<DerivationUnitTermType> copyDerivationUnitTerm = ((List<DerivationUnitTermType> ) strategy.copy(LocatorUtils.property(locator, "derivationUnitTerm", sourceDerivationUnitTerm), sourceDerivationUnitTerm));
                copy.unsetDerivationUnitTerm();
                List<DerivationUnitTermType> uniqueDerivationUnitTerml = copy.getDerivationUnitTerm();
                uniqueDerivationUnitTerml.addAll(copyDerivationUnitTerm);
            } else {
                copy.unsetDerivationUnitTerm();
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DerivedUnitType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof DerivedUnitType) {
            final DerivedUnitType target = this;
            final DerivedUnitType leftObject = ((DerivedUnitType) left);
            final DerivedUnitType rightObject = ((DerivedUnitType) right);
            {
                List<DerivationUnitTermType> lhsDerivationUnitTerm;
                lhsDerivationUnitTerm = leftObject.getDerivationUnitTerm();
                List<DerivationUnitTermType> rhsDerivationUnitTerm;
                rhsDerivationUnitTerm = rightObject.getDerivationUnitTerm();
                target.unsetDerivationUnitTerm();
                List<DerivationUnitTermType> uniqueDerivationUnitTerml = target.getDerivationUnitTerm();
                uniqueDerivationUnitTerml.addAll(((List<DerivationUnitTermType> ) strategy.merge(LocatorUtils.property(leftLocator, "derivationUnitTerm", lhsDerivationUnitTerm), LocatorUtils.property(rightLocator, "derivationUnitTerm", rhsDerivationUnitTerm), lhsDerivationUnitTerm, rhsDerivationUnitTerm)));
            }
        }
    }

    public void setDerivationUnitTerm(List<DerivationUnitTermType> value) {
        List<DerivationUnitTermType> draftl = this.getDerivationUnitTerm();
        draftl.addAll(value);
    }

    public DerivedUnitType withDerivationUnitTerm(DerivationUnitTermType... values) {
        if (values!= null) {
            for (DerivationUnitTermType value: values) {
                getDerivationUnitTerm().add(value);
            }
        }
        return this;
    }

    public DerivedUnitType withDerivationUnitTerm(Collection<DerivationUnitTermType> values) {
        if (values!= null) {
            getDerivationUnitTerm().addAll(values);
        }
        return this;
    }

    public DerivedUnitType withDerivationUnitTerm(List<DerivationUnitTermType> value) {
        setDerivationUnitTerm(value);
        return this;
    }

    @Override
    public DerivedUnitType withQuantityType(StringOrRefType value) {
        setQuantityType(value);
        return this;
    }

    @Override
    public DerivedUnitType withQuantityTypeReference(ReferenceType value) {
        setQuantityTypeReference(value);
        return this;
    }

    @Override
    public DerivedUnitType withCatalogSymbol(CodeType value) {
        setCatalogSymbol(value);
        return this;
    }

    @Override
    public DerivedUnitType withRemarks(String value) {
        setRemarks(value);
        return this;
    }

    @Override
    public DerivedUnitType withMetaDataProperty(MetaDataPropertyType... values) {
        if (values!= null) {
            for (MetaDataPropertyType value: values) {
                getMetaDataProperty().add(value);
            }
        }
        return this;
    }

    @Override
    public DerivedUnitType withMetaDataProperty(Collection<MetaDataPropertyType> values) {
        if (values!= null) {
            getMetaDataProperty().addAll(values);
        }
        return this;
    }

    @Override
    public DerivedUnitType withDescription(StringOrRefType value) {
        setDescription(value);
        return this;
    }

    @Override
    public DerivedUnitType withDescriptionReference(ReferenceType value) {
        setDescriptionReference(value);
        return this;
    }

    @Override
    public DerivedUnitType withIdentifier(CodeWithAuthorityType value) {
        setIdentifier(value);
        return this;
    }

    @Override
    public DerivedUnitType withName(CodeType... values) {
        if (values!= null) {
            for (CodeType value: values) {
                getName().add(value);
            }
        }
        return this;
    }

    @Override
    public DerivedUnitType withName(Collection<CodeType> values) {
        if (values!= null) {
            getName().addAll(values);
        }
        return this;
    }

    @Override
    public DerivedUnitType withId(String value) {
        setId(value);
        return this;
    }

    @Override
    public DerivedUnitType withMetaDataProperty(List<MetaDataPropertyType> value) {
        setMetaDataProperty(value);
        return this;
    }

    @Override
    public DerivedUnitType withName(List<CodeType> value) {
        setName(value);
        return this;
    }

}