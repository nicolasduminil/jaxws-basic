
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TtypeMessage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TtypeMessage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="journalier"/&gt;
 *     &lt;enumeration value="horaire"/&gt;
 *     &lt;enumeration value="infraHoraire"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TtypeMessage", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TtypeMessage {

    @XmlEnumValue("journalier")
    JOURNALIER("journalier"),
    @XmlEnumValue("horaire")
    HORAIRE("horaire"),
    @XmlEnumValue("infraHoraire")
    INFRA_HORAIRE("infraHoraire");
    private final String value;

    TtypeMessage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TtypeMessage fromValue(String v) {
        for (TtypeMessage c: TtypeMessage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
