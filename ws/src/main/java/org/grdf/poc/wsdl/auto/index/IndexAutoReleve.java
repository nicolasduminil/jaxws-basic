
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PCE" type="{com.grdf.poc.indexAutoReleve.V1.1.common}PCETypeLocal"/&gt;
 *         &lt;element name="sourceAutoReleve" type="{com.grdf.poc.type.v1.38}TsourceAutoReleve"/&gt;
 *         &lt;element name="origineAutoReleve" type="{com.grdf.poc.type.v1.38}TorigineAutoReleve"/&gt;
 *         &lt;element name="dateDemande" type="{com.grdf.poc.type.v1.38}Thorodate"/&gt;
 *         &lt;element name="idExterneDemande" type="{com.grdf.poc.indexAutoReleve.V1.1.common}idExterneDemandeTypeLocal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pce",
    "sourceAutoReleve",
    "origineAutoReleve",
    "dateDemande",
    "idExterneDemande"
})
@XmlRootElement(name = "indexAutoReleve")
public class IndexAutoReleve {

    @XmlElement(name = "PCE", required = true)
    protected PCETypeLocal pce;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TsourceAutoReleve sourceAutoReleve;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TorigineAutoReleve origineAutoReleve;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDemande;
    protected String idExterneDemande;

    /**
     * Gets the value of the pce property.
     * 
     * @return
     *     possible object is
     *     {@link PCETypeLocal }
     *     
     */
    public PCETypeLocal getPCE() {
        return pce;
    }

    /**
     * Sets the value of the pce property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCETypeLocal }
     *     
     */
    public void setPCE(PCETypeLocal value) {
        this.pce = value;
    }

    /**
     * Gets the value of the sourceAutoReleve property.
     * 
     * @return
     *     possible object is
     *     {@link TsourceAutoReleve }
     *     
     */
    public TsourceAutoReleve getSourceAutoReleve() {
        return sourceAutoReleve;
    }

    /**
     * Sets the value of the sourceAutoReleve property.
     * 
     * @param value
     *     allowed object is
     *     {@link TsourceAutoReleve }
     *     
     */
    public void setSourceAutoReleve(TsourceAutoReleve value) {
        this.sourceAutoReleve = value;
    }

    /**
     * Gets the value of the origineAutoReleve property.
     * 
     * @return
     *     possible object is
     *     {@link TorigineAutoReleve }
     *     
     */
    public TorigineAutoReleve getOrigineAutoReleve() {
        return origineAutoReleve;
    }

    /**
     * Sets the value of the origineAutoReleve property.
     * 
     * @param value
     *     allowed object is
     *     {@link TorigineAutoReleve }
     *     
     */
    public void setOrigineAutoReleve(TorigineAutoReleve value) {
        this.origineAutoReleve = value;
    }

    /**
     * Gets the value of the dateDemande property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDemande() {
        return dateDemande;
    }

    /**
     * Sets the value of the dateDemande property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDemande(XMLGregorianCalendar value) {
        this.dateDemande = value;
    }

    /**
     * Gets the value of the idExterneDemande property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdExterneDemande() {
        return idExterneDemande;
    }

    /**
     * Sets the value of the idExterneDemande property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdExterneDemande(String value) {
        this.idExterneDemande = value;
    }

}
