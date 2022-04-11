
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeTypeReleve.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeTypeReleve"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="normal"/&gt;
 *     &lt;enumeration value="special"/&gt;
 *     &lt;enumeration value="corrige"/&gt;
 *     &lt;enumeration value="annule"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeTypeReleve", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeTypeReleve {

    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("special")
    SPECIAL("special"),
    @XmlEnumValue("corrige")
    CORRIGE("corrige"),
    @XmlEnumValue("annule")
    ANNULE("annule");
    private final String value;

    TcodeTypeReleve(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeTypeReleve fromValue(String v) {
        for (TcodeTypeReleve c: TcodeTypeReleve.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
