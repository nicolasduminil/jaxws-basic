
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PCETypeLocal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PCETypeLocal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clePCE" type="{com.grdf.poc.type.v1.38}TclePCE"/&gt;
 *         &lt;element name="compteur" type="{com.grdf.poc.indexAutoReleve.V1.1.common}compteurTypeLocal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PCETypeLocal", propOrder = {
    "clePCE",
    "compteur"
})
public class PCETypeLocal {

    @XmlElement(required = true)
    protected String clePCE;
    @XmlElement(required = true)
    protected CompteurTypeLocal compteur;

    /**
     * Gets the value of the clePCE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClePCE() {
        return clePCE;
    }

    /**
     * Sets the value of the clePCE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClePCE(String value) {
        this.clePCE = value;
    }

    /**
     * Gets the value of the compteur property.
     * 
     * @return
     *     possible object is
     *     {@link CompteurTypeLocal }
     *     
     */
    public CompteurTypeLocal getCompteur() {
        return compteur;
    }

    /**
     * Sets the value of the compteur property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompteurTypeLocal }
     *     
     */
    public void setCompteur(CompteurTypeLocal value) {
        this.compteur = value;
    }

}
