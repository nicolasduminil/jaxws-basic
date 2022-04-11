
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeModeAcquisitionImpulsion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeModeAcquisitionImpulsion"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACR"/&gt;
 *     &lt;enumeration value="INT"/&gt;
 *     &lt;enumeration value="TLR"/&gt;
 *     &lt;enumeration value="NCO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeModeAcquisitionImpulsion", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeModeAcquisitionImpulsion {

    ACR,
    INT,
    TLR,
    NCO;

    public String value() {
        return name();
    }

    public static TcodeModeAcquisitionImpulsion fromValue(String v) {
        return valueOf(v);
    }

}