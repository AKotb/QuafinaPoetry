
package com.org.tempuri;

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
 *         &lt;element name="Poet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "poet"
})
@XmlRootElement(name = "GetSea")
public class GetSea {

    @XmlElement(name = "Poet")
    protected String poet;

    /**
     * Gets the value of the poet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoet() {
        return poet;
    }

    /**
     * Sets the value of the poet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoet(String value) {
        this.poet = value;
    }

}
