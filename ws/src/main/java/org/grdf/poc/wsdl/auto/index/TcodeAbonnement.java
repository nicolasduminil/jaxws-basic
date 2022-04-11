
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeAbonnement.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeAbonnement"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PCEenEtatEquipe"/&gt;
 *     &lt;enumeration value="priseAbonnement"/&gt;
 *     &lt;enumeration value="desabonnement"/&gt;
 *     &lt;enumeration value="autre"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeAbonnement", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeAbonnement {

    @XmlEnumValue("PCEenEtatEquipe")
    PC_EEN_ETAT_EQUIPE("PCEenEtatEquipe"),
    @XmlEnumValue("priseAbonnement")
    PRISE_ABONNEMENT("priseAbonnement"),
    @XmlEnumValue("desabonnement")
    DESABONNEMENT("desabonnement"),
    @XmlEnumValue("autre")
    AUTRE("autre");
    private final String value;

    TcodeAbonnement(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeAbonnement fromValue(String v) {
        for (TcodeAbonnement c: TcodeAbonnement.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
