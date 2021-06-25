
package jaxb.classes;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="supplier" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item", propOrder = {
    "id",
    "name",
    "itemCode",
    "status",
    "price",
    "supplier"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Item {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected long id;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String name;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String itemCode;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String status;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected long price;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected long supplier;

    /**
     * Gets the value of the id property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the itemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getItemCode() {
        return itemCode;
    }

    /**
     * Sets the value of the itemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public long getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPrice(long value) {
        this.price = value;
    }

    /**
     * Gets the value of the supplier property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public long getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSupplier(long value) {
        this.supplier = value;
    }

}
