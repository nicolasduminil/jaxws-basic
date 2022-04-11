
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for compteurTypeLocal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="compteurTypeLocal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cleCompteur" type="{com.grdf.poc.type.v1.38}TcleCompteur" minOccurs="0"/&gt;
 *         &lt;element name="index" type="{com.grdf.poc.indexAutoReleve.V1.1.common}TIndex"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compteurTypeLocal", propOrder = {
    "cleCompteur",
    "index"
})
public class CompteurTypeLocal {

    protected String cleCompteur;
    @XmlElement(required = true)
    protected TIndex index;

    /**
     * Gets the value of the cleCompteur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCleCompteur() {
        return cleCompteur;
    }

    /**
     * Sets the value of the cleCompteur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCleCompteur(String value) {
        this.cleCompteur = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link TIndex }
     *     
     */
    public TIndex getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIndex }
     *     
     */
    public void setIndex(TIndex value) {
        this.index = value;
    }

}
