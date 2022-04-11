
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TmotifRetour.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TmotifRetour"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="recyclage"/&gt;
 *     &lt;enumeration value="litige"/&gt;
 *     &lt;enumeration value="defectueux"/&gt;
 *     &lt;enumeration value="excedent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TmotifRetour", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TmotifRetour {

    @XmlEnumValue("recyclage")
    RECYCLAGE("recyclage"),
    @XmlEnumValue("litige")
    LITIGE("litige"),
    @XmlEnumValue("defectueux")
    DEFECTUEUX("defectueux"),
    @XmlEnumValue("excedent")
    EXCEDENT("excedent");
    private final String value;

    TmotifRetour(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TmotifRetour fromValue(String v) {
        for (TmotifRetour c: TmotifRetour.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
