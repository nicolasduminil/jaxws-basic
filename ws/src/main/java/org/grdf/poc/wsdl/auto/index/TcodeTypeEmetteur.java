
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeTypeEmetteur.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeTypeEmetteur"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="integre"/&gt;
 *     &lt;enumeration value="deporte"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeTypeEmetteur", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeTypeEmetteur {

    @XmlEnumValue("integre")
    INTEGRE("integre"),
    @XmlEnumValue("deporte")
    DEPORTE("deporte");
    private final String value;

    TcodeTypeEmetteur(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeTypeEmetteur fromValue(String v) {
        for (TcodeTypeEmetteur c: TcodeTypeEmetteur.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
