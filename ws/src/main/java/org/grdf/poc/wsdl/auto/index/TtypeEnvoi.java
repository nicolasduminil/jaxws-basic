
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TtypeEnvoi.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TtypeEnvoi"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="envoi"/&gt;
 *     &lt;enumeration value="annulation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TtypeEnvoi", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TtypeEnvoi {

    @XmlEnumValue("envoi")
    ENVOI("envoi"),
    @XmlEnumValue("annulation")
    ANNULATION("annulation");
    private final String value;

    TtypeEnvoi(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TtypeEnvoi fromValue(String v) {
        for (TtypeEnvoi c: TtypeEnvoi.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
