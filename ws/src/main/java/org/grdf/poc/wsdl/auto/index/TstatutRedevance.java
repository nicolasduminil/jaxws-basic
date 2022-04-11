
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TstatutRedevance.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TstatutRedevance"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cree"/&gt;
 *     &lt;enumeration value="lancee"/&gt;
 *     &lt;enumeration value="receptionnee"/&gt;
 *     &lt;enumeration value="blocage"/&gt;
 *     &lt;enumeration value="blocagePaiement"/&gt;
 *     &lt;enumeration value="miseEnPaiementDemandee"/&gt;
 *     &lt;enumeration value="paiementEffectue"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TstatutRedevance", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TstatutRedevance {

    @XmlEnumValue("cree")
    CREE("cree"),
    @XmlEnumValue("lancee")
    LANCEE("lancee"),
    @XmlEnumValue("receptionnee")
    RECEPTIONNEE("receptionnee"),
    @XmlEnumValue("blocage")
    BLOCAGE("blocage"),
    @XmlEnumValue("blocagePaiement")
    BLOCAGE_PAIEMENT("blocagePaiement"),
    @XmlEnumValue("miseEnPaiementDemandee")
    MISE_EN_PAIEMENT_DEMANDEE("miseEnPaiementDemandee"),
    @XmlEnumValue("paiementEffectue")
    PAIEMENT_EFFECTUE("paiementEffectue");
    private final String value;

    TstatutRedevance(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TstatutRedevance fromValue(String v) {
        for (TstatutRedevance c: TstatutRedevance.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
