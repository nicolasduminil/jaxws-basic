
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpasDemandeConso.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TpasDemandeConso"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="journalier"/&gt;
 *     &lt;enumeration value="horaire"/&gt;
 *     &lt;enumeration value="journalierEtHoraire"/&gt;
 *     &lt;enumeration value="journalierEtInfraHoraire"/&gt;
 *     &lt;enumeration value="infraHoraire"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpasDemandeConso", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TpasDemandeConso {

    @XmlEnumValue("journalier")
    JOURNALIER("journalier"),
    @XmlEnumValue("horaire")
    HORAIRE("horaire"),
    @XmlEnumValue("journalierEtHoraire")
    JOURNALIER_ET_HORAIRE("journalierEtHoraire"),
    @XmlEnumValue("journalierEtInfraHoraire")
    JOURNALIER_ET_INFRA_HORAIRE("journalierEtInfraHoraire"),
    @XmlEnumValue("infraHoraire")
    INFRA_HORAIRE("infraHoraire");
    private final String value;

    TpasDemandeConso(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpasDemandeConso fromValue(String v) {
        for (TpasDemandeConso c: TpasDemandeConso.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
