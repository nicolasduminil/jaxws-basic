
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeStatutActivationEmetteur.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeStatutActivationEmetteur"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="active"/&gt;
 *     &lt;enumeration value="desactive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeStatutActivationEmetteur", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeStatutActivationEmetteur {

    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("desactive")
    DESACTIVE("desactive");
    private final String value;

    TcodeStatutActivationEmetteur(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeStatutActivationEmetteur fromValue(String v) {
        for (TcodeStatutActivationEmetteur c: TcodeStatutActivationEmetteur.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
