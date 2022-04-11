
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeModeAcquisitionIndex.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeModeAcquisitionIndex"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TLR"/&gt;
 *     &lt;enumeration value="INT"/&gt;
 *     &lt;enumeration value="ACR"/&gt;
 *     &lt;enumeration value="NCO"/&gt;
 *     &lt;enumeration value="ARR"/&gt;
 *     &lt;enumeration value="RAP"/&gt;
 *     &lt;enumeration value="ARF"/&gt;
 *     &lt;enumeration value="ARI"/&gt;
 *     &lt;enumeration value="ARP"/&gt;
 *     &lt;enumeration value="ARS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeModeAcquisitionIndex", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeModeAcquisitionIndex {

    TLR,
    INT,
    ACR,
    NCO,
    ARR,
    RAP,
    ARF,
    ARI,
    ARP,
    ARS;

    public String value() {
        return name();
    }

    public static TcodeModeAcquisitionIndex fromValue(String v) {
        return valueOf(v);
    }

}
