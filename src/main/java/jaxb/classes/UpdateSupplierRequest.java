
package jaxb.classes;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Supplier" type="{https://rca.ac.rw/Edine-noella/soap-app}Supplier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "supplier"
})
@XmlRootElement(name = "UpdateSupplierRequest")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class UpdateSupplierRequest {

    @XmlElement(name = "Supplier", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Supplier supplier;

    /**
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link Supplier }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Supplier getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Supplier }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSupplier(Supplier value) {
        this.supplier = value;
    }

}
