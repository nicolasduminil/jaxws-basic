
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for indexAutoReleveResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="indexAutoReleveResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{com.grdf.poc.indexAutoReleve.V1.1.common}indexAutoReleve" minOccurs="0"/&gt;
 *         &lt;element name="resultat" type="{com.grdf.poc.IndexAutoReleveResponse-v1.2}resultType" minOccurs="0"/&gt;
 *         &lt;element name="erreur" type="{com.grdf.poc.IndexAutoReleveResponse-v1.2}erreurType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indexAutoReleveResponseType", namespace = "com.grdf.poc.IndexAutoReleveResponse-v1.2", propOrder = {
    "indexAutoReleve",
    "resultat",
    "erreur"
})
public class IndexAutoReleveResponseType {

    @XmlElement(namespace = "com.grdf.poc.indexAutoReleve.V1.1.common")
    protected IndexAutoReleve indexAutoReleve;
    @XmlSchemaType(name = "string")
    protected ResultType resultat;
    protected ErreurType erreur;

    /**
     * Gets the value of the indexAutoReleve property.
     * 
     * @return
     *     possible object is
     *     {@link IndexAutoReleve }
     *     
     */
    public IndexAutoReleve getIndexAutoReleve() {
        return indexAutoReleve;
    }

    /**
     * Sets the value of the indexAutoReleve property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexAutoReleve }
     *     
     */
    public void setIndexAutoReleve(IndexAutoReleve value) {
        this.indexAutoReleve = value;
    }

    /**
     * Gets the value of the resultat property.
     * 
     * @return
     *     possible object is
     *     {@link ResultType }
     *     
     */
    public ResultType getResultat() {
        return resultat;
    }

    /**
     * Sets the value of the resultat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultType }
     *     
     */
    public void setResultat(ResultType value) {
        this.resultat = value;
    }

    /**
     * Gets the value of the erreur property.
     * 
     * @return
     *     possible object is
     *     {@link ErreurType }
     *     
     */
    public ErreurType getErreur() {
        return erreur;
    }

    /**
     * Sets the value of the erreur property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErreurType }
     *     
     */
    public void setErreur(ErreurType value) {
        this.erreur = value;
    }

}
