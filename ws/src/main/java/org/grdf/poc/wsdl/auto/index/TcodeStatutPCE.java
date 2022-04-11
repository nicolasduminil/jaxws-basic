
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeStatutPCE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeStatutPCE"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="actif"/&gt;
 *     &lt;enumeration value="inactif"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeStatutPCE", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeStatutPCE {

    @XmlEnumValue("actif")
    ACTIF("actif"),
    @XmlEnumValue("inactif")
    INACTIF("inactif");
    private final String value;

    TcodeStatutPCE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeStatutPCE fromValue(String v) {
        for (TcodeStatutPCE c: TcodeStatutPCE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
