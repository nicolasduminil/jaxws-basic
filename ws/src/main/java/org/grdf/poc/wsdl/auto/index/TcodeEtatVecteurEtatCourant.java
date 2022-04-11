
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeEtatVecteurEtatCourant.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeEtatVecteurEtatCourant"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="fraude"/&gt;
 *     &lt;enumeration value="utilisationSortieClient"/&gt;
 *     &lt;enumeration value="accesInterfaceLocaleOuAdistanceDuDdC"/&gt;
 *     &lt;enumeration value="sous-tension"/&gt;
 *     &lt;enumeration value="retourAPuissanceDeTransmissionMaximale"/&gt;
 *     &lt;enumeration value="jourDePassageAHeureEteOuHiver"/&gt;
 *     &lt;enumeration value="miseAJourLogicielPartiellementTelechargee"/&gt;
 *     &lt;enumeration value="miseAJourLogicielValideeEtMiseEnService"/&gt;
 *     &lt;enumeration value="modeIntegration"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeEtatVecteurEtatCourant", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeEtatVecteurEtatCourant {

    @XmlEnumValue("fraude")
    FRAUDE("fraude"),
    @XmlEnumValue("utilisationSortieClient")
    UTILISATION_SORTIE_CLIENT("utilisationSortieClient"),
    @XmlEnumValue("accesInterfaceLocaleOuAdistanceDuDdC")
    ACCES_INTERFACE_LOCALE_OU_ADISTANCE_DU_DD_C("accesInterfaceLocaleOuAdistanceDuDdC"),
    @XmlEnumValue("sous-tension")
    SOUS_TENSION("sous-tension"),
    @XmlEnumValue("retourAPuissanceDeTransmissionMaximale")
    RETOUR_A_PUISSANCE_DE_TRANSMISSION_MAXIMALE("retourAPuissanceDeTransmissionMaximale"),
    @XmlEnumValue("jourDePassageAHeureEteOuHiver")
    JOUR_DE_PASSAGE_A_HEURE_ETE_OU_HIVER("jourDePassageAHeureEteOuHiver"),
    @XmlEnumValue("miseAJourLogicielPartiellementTelechargee")
    MISE_A_JOUR_LOGICIEL_PARTIELLEMENT_TELECHARGEE("miseAJourLogicielPartiellementTelechargee"),
    @XmlEnumValue("miseAJourLogicielValideeEtMiseEnService")
    MISE_A_JOUR_LOGICIEL_VALIDEE_ET_MISE_EN_SERVICE("miseAJourLogicielValideeEtMiseEnService"),
    @XmlEnumValue("modeIntegration")
    MODE_INTEGRATION("modeIntegration");
    private final String value;

    TcodeEtatVecteurEtatCourant(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeEtatVecteurEtatCourant fromValue(String v) {
        for (TcodeEtatVecteurEtatCourant c: TcodeEtatVecteurEtatCourant.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
