
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpocHdr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpocHdr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idFlux" type="{com.grdf.poc.header.v1.1}TidFlux"/&gt;
 *         &lt;element name="idFonc" type="{com.grdf.poc.header.v1.1}TidFonc"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpocHdr", namespace = "com.grdf.poc.header.v1.1", propOrder = {
    "idFlux",
    "idFonc"
})
public class TpocHdr {

    @XmlElement(required = true)
    protected String idFlux;
    @XmlElement(required = true)
    protected String idFonc;

    /**
     * Gets the value of the idFlux property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFlux() {
        return idFlux;
    }

    /**
     * Sets the value of the idFlux property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFlux(String value) {
        this.idFlux = value;
    }

    /**
     * Gets the value of the idFonc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFonc() {
        return idFonc;
    }

    /**
     * Sets the value of the idFonc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFonc(String value) {
        this.idFonc = value;
    }

}
