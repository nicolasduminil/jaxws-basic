
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeTypeConsommation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeTypeConsommation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="conforme"/&gt;
 *     &lt;enumeration value="anomalie"/&gt;
 *     &lt;enumeration value="erreur"/&gt;
 *     &lt;enumeration value="annulee"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeTypeConsommation", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeTypeConsommation {

    @XmlEnumValue("conforme")
    CONFORME("conforme"),
    @XmlEnumValue("anomalie")
    ANOMALIE("anomalie"),
    @XmlEnumValue("erreur")
    ERREUR("erreur"),
    @XmlEnumValue("annulee")
    ANNULEE("annulee");
    private final String value;

    TcodeTypeConsommation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeTypeConsommation fromValue(String v) {
        for (TcodeTypeConsommation c: TcodeTypeConsommation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
