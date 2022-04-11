
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TtypeCommande.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TtypeCommande"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="lecture"/&gt;
 *     &lt;enumeration value="ecriture"/&gt;
 *     &lt;enumeration value="declenchementInstPing"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TtypeCommande", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TtypeCommande {

    @XmlEnumValue("lecture")
    LECTURE("lecture"),
    @XmlEnumValue("ecriture")
    ECRITURE("ecriture"),
    @XmlEnumValue("declenchementInstPing")
    DECLENCHEMENT_INST_PING("declenchementInstPing");
    private final String value;

    TtypeCommande(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TtypeCommande fromValue(String v) {
        for (TtypeCommande c: TtypeCommande.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
