
package jaxb.classes;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Supplier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Supplier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="names" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Supplier", propOrder = {
    "id",
    "names",
    "email",
    "mobile"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Supplier {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected long id;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String names;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String email;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String mobile;

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
     * Gets the value of the names property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getNames() {
        return names;
    }

    /**
     * Sets the value of the names property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNames(String value) {
        this.names = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2021-06-25T04:59:01+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMobile(String value) {
        this.mobile = value;
    }

}
