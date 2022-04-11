
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeNatureGaz.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeNatureGaz"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="Propane"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeNatureGaz", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeNatureGaz {

    B("B"),
    H("H"),
    @XmlEnumValue("Propane")
    PROPANE("Propane");
    private final String value;

    TcodeNatureGaz(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeNatureGaz fromValue(String v) {
        for (TcodeNatureGaz c: TcodeNatureGaz.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
