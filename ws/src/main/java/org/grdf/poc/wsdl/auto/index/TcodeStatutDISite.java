
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeStatutDISite.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeStatutDISite"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="succes"/&gt;
 *     &lt;enumeration value="echec"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeStatutDISite", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeStatutDISite {

    @XmlEnumValue("succes")
    SUCCES("succes"),
    @XmlEnumValue("echec")
    ECHEC("echec");
    private final String value;

    TcodeStatutDISite(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeStatutDISite fromValue(String v) {
        for (TcodeStatutDISite c: TcodeStatutDISite.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
