
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for indexAutoReleveRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="indexAutoReleveRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{com.grdf.poc.indexAutoReleve.V1.1.common}indexAutoReleve"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indexAutoReleveRequestType", namespace = "com.grdf.poc.IndexAutoReleveRequest-v1.2", propOrder = {
    "indexAutoReleve"
})
public class IndexAutoReleveRequestType {

    @XmlElement(namespace = "com.grdf.poc.indexAutoReleve.V1.1.common", required = true)
    protected IndexAutoReleve indexAutoReleve;

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

}
