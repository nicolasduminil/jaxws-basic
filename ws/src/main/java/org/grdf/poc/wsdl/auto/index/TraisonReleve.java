
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TraisonReleve.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TraisonReleve"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cyclique"/&gt;
 *     &lt;enumeration value="evenementielle"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TraisonReleve", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TraisonReleve {

    @XmlEnumValue("cyclique")
    CYCLIQUE("cyclique"),
    @XmlEnumValue("evenementielle")
    EVENEMENTIELLE("evenementielle");
    private final String value;

    TraisonReleve(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TraisonReleve fromValue(String v) {
        for (TraisonReleve c: TraisonReleve.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
