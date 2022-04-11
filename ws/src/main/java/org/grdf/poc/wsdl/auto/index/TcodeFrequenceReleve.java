
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeFrequenceReleve.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeFrequenceReleve"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="journalier"/&gt;
 *     &lt;enumeration value="horaire"/&gt;
 *     &lt;enumeration value="infraHoraire"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeFrequenceReleve", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeFrequenceReleve {

    @XmlEnumValue("journalier")
    JOURNALIER("journalier"),
    @XmlEnumValue("horaire")
    HORAIRE("horaire"),
    @XmlEnumValue("infraHoraire")
    INFRA_HORAIRE("infraHoraire");
    private final String value;

    TcodeFrequenceReleve(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeFrequenceReleve fromValue(String v) {
        for (TcodeFrequenceReleve c: TcodeFrequenceReleve.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
