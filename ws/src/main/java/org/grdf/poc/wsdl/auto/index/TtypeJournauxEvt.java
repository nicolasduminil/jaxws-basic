
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TtypeJournauxEvt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TtypeJournauxEvt"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="erreur"/&gt;
 *     &lt;enumeration value="trace"/&gt;
 *     &lt;enumeration value="evenement"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TtypeJournauxEvt", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TtypeJournauxEvt {

    @XmlEnumValue("erreur")
    ERREUR("erreur"),
    @XmlEnumValue("trace")
    TRACE("trace"),
    @XmlEnumValue("evenement")
    EVENEMENT("evenement");
    private final String value;

    TtypeJournauxEvt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TtypeJournauxEvt fromValue(String v) {
        for (TtypeJournauxEvt c: TtypeJournauxEvt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
