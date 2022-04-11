
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TstatutAbonnementConsoInformative.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TstatutAbonnementConsoInformative"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="enAttentePriseEnCharge"/&gt;
 *     &lt;enumeration value="enCours"/&gt;
 *     &lt;enumeration value="enAttenteDeResiliation"/&gt;
 *     &lt;enumeration value="resiliee"/&gt;
 *     &lt;enumeration value="rejetee"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TstatutAbonnementConsoInformative", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TstatutAbonnementConsoInformative {

    @XmlEnumValue("enAttentePriseEnCharge")
    EN_ATTENTE_PRISE_EN_CHARGE("enAttentePriseEnCharge"),
    @XmlEnumValue("enCours")
    EN_COURS("enCours"),
    @XmlEnumValue("enAttenteDeResiliation")
    EN_ATTENTE_DE_RESILIATION("enAttenteDeResiliation"),
    @XmlEnumValue("resiliee")
    RESILIEE("resiliee"),
    @XmlEnumValue("rejetee")
    REJETEE("rejetee");
    private final String value;

    TstatutAbonnementConsoInformative(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TstatutAbonnementConsoInformative fromValue(String v) {
        for (TstatutAbonnementConsoInformative c: TstatutAbonnementConsoInformative.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
