
package com.org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnalysisClass complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnalysisClass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Difference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalysisClass", propOrder = {
    "sea",
    "count",
    "originalCount",
    "difference"
})
public class AnalysisClass {

    @XmlElement(name = "Sea")
    protected String sea;
    @XmlElement(name = "Count")
    protected String count;
    @XmlElement(name = "OriginalCount")
    protected String originalCount;
    @XmlElement(name = "Difference")
    protected String difference;

    /**
     * Gets the value of the sea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSea() {
        return sea;
    }

    /**
     * Sets the value of the sea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSea(String value) {
        this.sea = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCount(String value) {
        this.count = value;
    }

    /**
     * Gets the value of the originalCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalCount() {
        return originalCount;
    }

    /**
     * Sets the value of the originalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalCount(String value) {
        this.originalCount = value;
    }

    /**
     * Gets the value of the difference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDifference() {
        return difference;
    }

    /**
     * Sets the value of the difference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDifference(String value) {
        this.difference = value;
    }

}
