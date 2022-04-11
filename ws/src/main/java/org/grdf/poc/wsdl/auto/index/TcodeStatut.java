
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeStatut.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeStatut"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="succes"/&gt;
 *     &lt;enumeration value="echec"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeStatut", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeStatut {

    @XmlEnumValue("succes")
    SUCCES("succes"),
    @XmlEnumValue("echec")
    ECHEC("echec");
    private final String value;

    TcodeStatut(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeStatut fromValue(String v) {
        for (TcodeStatut c: TcodeStatut.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
