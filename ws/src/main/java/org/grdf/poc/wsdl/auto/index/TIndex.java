
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TIndex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIndex"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="valeurIndex" type="{com.grdf.poc.type.v1.38}TvaleurIndex"/&gt;
 *         &lt;element name="codeQualificationIndex" type="{com.grdf.poc.type.v1.38}TcodeQualificationIndex"/&gt;
 *         &lt;element name="horodateIndex" type="{com.grdf.poc.type.v1.38}Thorodate"/&gt;
 *         &lt;element name="codeTypeIndex" type="{com.grdf.poc.type.v1.38}TcodeTypeIndex"/&gt;
 *         &lt;element name="codeModeAcquisitionIndex" type="{com.grdf.poc.type.v1.38}TcodeModeAcquisitionIndex"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIndex", propOrder = {
    "valeurIndex",
    "codeQualificationIndex",
    "horodateIndex",
    "codeTypeIndex",
    "codeModeAcquisitionIndex"
})
public class TIndex {

    @XmlSchemaType(name = "long")
    protected int valeurIndex;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TcodeQualificationIndex codeQualificationIndex;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar horodateIndex;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TcodeTypeIndex codeTypeIndex;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TcodeModeAcquisitionIndex codeModeAcquisitionIndex;

    /**
     * Gets the value of the valeurIndex property.
     * 
     */
    public int getValeurIndex() {
        return valeurIndex;
    }

    /**
     * Sets the value of the valeurIndex property.
     * 
     */
    public void setValeurIndex(int value) {
        this.valeurIndex = value;
    }

    /**
     * Gets the value of the codeQualificationIndex property.
     * 
     * @return
     *     possible object is
     *     {@link TcodeQualificationIndex }
     *     
     */
    public TcodeQualificationIndex getCodeQualificationIndex() {
        return codeQualificationIndex;
    }

    /**
     * Sets the value of the codeQualificationIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcodeQualificationIndex }
     *     
     */
    public void setCodeQualificationIndex(TcodeQualificationIndex value) {
        this.codeQualificationIndex = value;
    }

    /**
     * Gets the value of the horodateIndex property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHorodateIndex() {
        return horodateIndex;
    }

    /**
     * Sets the value of the horodateIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHorodateIndex(XMLGregorianCalendar value) {
        this.horodateIndex = value;
    }

    /**
     * Gets the value of the codeTypeIndex property.
     * 
     * @return
     *     possible object is
     *     {@link TcodeTypeIndex }
     *     
     */
    public TcodeTypeIndex getCodeTypeIndex() {
        return codeTypeIndex;
    }

    /**
     * Sets the value of the codeTypeIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcodeTypeIndex }
     *     
     */
    public void setCodeTypeIndex(TcodeTypeIndex value) {
        this.codeTypeIndex = value;
    }

    /**
     * Gets the value of the codeModeAcquisitionIndex property.
     * 
     * @return
     *     possible object is
     *     {@link TcodeModeAcquisitionIndex }
     *     
     */
    public TcodeModeAcquisitionIndex getCodeModeAcquisitionIndex() {
        return codeModeAcquisitionIndex;
    }

    /**
     * Sets the value of the codeModeAcquisitionIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link TcodeModeAcquisitionIndex }
     *     
     */
    public void setCodeModeAcquisitionIndex(TcodeModeAcquisitionIndex value) {
        this.codeModeAcquisitionIndex = value;
    }

}
