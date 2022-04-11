
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemplacementCompteur.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TemplacementCompteur"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="interieur"/&gt;
 *     &lt;enumeration value="exterieur"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TemplacementCompteur", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TemplacementCompteur {

    @XmlEnumValue("interieur")
    INTERIEUR("interieur"),
    @XmlEnumValue("exterieur")
    EXTERIEUR("exterieur");
    private final String value;

    TemplacementCompteur(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TemplacementCompteur fromValue(String v) {
        for (TemplacementCompteur c: TemplacementCompteur.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
