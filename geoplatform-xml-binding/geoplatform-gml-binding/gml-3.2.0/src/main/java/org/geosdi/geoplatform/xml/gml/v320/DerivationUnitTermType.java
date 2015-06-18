//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.06.18 alle 12:52:42 AM CEST 
//


package org.geosdi.geoplatform.xml.gml.v320;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * <p>Classe Java per DerivationUnitTermType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DerivationUnitTermType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}UnitOfMeasureType">
 *       &lt;attribute name="exponent" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivationUnitTermType")
public class DerivationUnitTermType
    extends UnitOfMeasureType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlAttribute(name = "exponent")
    protected BigInteger exponent;

    /**
     * Recupera il valore della proprietà exponent.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExponent() {
        return exponent;
    }

    /**
     * Imposta il valore della proprietà exponent.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExponent(BigInteger value) {
        this.exponent = value;
    }

    public boolean isSetExponent() {
        return (this.exponent!= null);
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
            BigInteger theExponent;
            theExponent = this.getExponent();
            strategy.appendField(locator, this, "exponent", buffer, theExponent);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DerivationUnitTermType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DerivationUnitTermType that = ((DerivationUnitTermType) object);
        {
            BigInteger lhsExponent;
            lhsExponent = this.getExponent();
            BigInteger rhsExponent;
            rhsExponent = that.getExponent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exponent", lhsExponent), LocatorUtils.property(thatLocator, "exponent", rhsExponent), lhsExponent, rhsExponent)) {
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
            BigInteger theExponent;
            theExponent = this.getExponent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exponent", theExponent), currentHashCode, theExponent);
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
        if (draftCopy instanceof DerivationUnitTermType) {
            final DerivationUnitTermType copy = ((DerivationUnitTermType) draftCopy);
            if (this.isSetExponent()) {
                BigInteger sourceExponent;
                sourceExponent = this.getExponent();
                BigInteger copyExponent = ((BigInteger) strategy.copy(LocatorUtils.property(locator, "exponent", sourceExponent), sourceExponent));
                copy.setExponent(copyExponent);
            } else {
                copy.exponent = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DerivationUnitTermType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof DerivationUnitTermType) {
            final DerivationUnitTermType target = this;
            final DerivationUnitTermType leftObject = ((DerivationUnitTermType) left);
            final DerivationUnitTermType rightObject = ((DerivationUnitTermType) right);
            {
                BigInteger lhsExponent;
                lhsExponent = leftObject.getExponent();
                BigInteger rhsExponent;
                rhsExponent = rightObject.getExponent();
                target.setExponent(((BigInteger) strategy.merge(LocatorUtils.property(leftLocator, "exponent", lhsExponent), LocatorUtils.property(rightLocator, "exponent", rhsExponent), lhsExponent, rhsExponent)));
            }
        }
    }

    public DerivationUnitTermType withExponent(BigInteger value) {
        setExponent(value);
        return this;
    }

    @Override
    public DerivationUnitTermType withUom(String value) {
        setUom(value);
        return this;
    }

}