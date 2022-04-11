
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpasDeMesure.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TpasDeMesure"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="journalier"/&gt;
 *     &lt;enumeration value="horaire"/&gt;
 *     &lt;enumeration value="infra-horaire"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpasDeMesure", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TpasDeMesure {

    @XmlEnumValue("journalier")
    JOURNALIER("journalier"),
    @XmlEnumValue("horaire")
    HORAIRE("horaire"),
    @XmlEnumValue("infra-horaire")
    INFRA_HORAIRE("infra-horaire");
    private final String value;

    TpasDeMesure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpasDeMesure fromValue(String v) {
        for (TpasDeMesure c: TpasDeMesure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
