
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeTypeBranchtCompteur.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeTypeBranchtCompteur"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="individuelProductif"/&gt;
 *     &lt;enumeration value="individuelImproductif"/&gt;
 *     &lt;enumeration value="collectifProductif"/&gt;
 *     &lt;enumeration value="collectifImproductif"/&gt;
 *     &lt;enumeration value="forfaitCuisine"/&gt;
 *     &lt;enumeration value="venteGazRepartie"/&gt;
 *     &lt;enumeration value="aucun"/&gt;
 *     &lt;enumeration value="autre3"/&gt;
 *     &lt;enumeration value="autre4"/&gt;
 *     &lt;enumeration value="autre9"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeTypeBranchtCompteur", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeTypeBranchtCompteur {

    @XmlEnumValue("individuelProductif")
    INDIVIDUEL_PRODUCTIF("individuelProductif"),
    @XmlEnumValue("individuelImproductif")
    INDIVIDUEL_IMPRODUCTIF("individuelImproductif"),
    @XmlEnumValue("collectifProductif")
    COLLECTIF_PRODUCTIF("collectifProductif"),
    @XmlEnumValue("collectifImproductif")
    COLLECTIF_IMPRODUCTIF("collectifImproductif"),
    @XmlEnumValue("forfaitCuisine")
    FORFAIT_CUISINE("forfaitCuisine"),
    @XmlEnumValue("venteGazRepartie")
    VENTE_GAZ_REPARTIE("venteGazRepartie"),
    @XmlEnumValue("aucun")
    AUCUN("aucun"),
    @XmlEnumValue("autre3")
    AUTRE_3("autre3"),
    @XmlEnumValue("autre4")
    AUTRE_4("autre4"),
    @XmlEnumValue("autre9")
    AUTRE_9("autre9");
    private final String value;

    TcodeTypeBranchtCompteur(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeTypeBranchtCompteur fromValue(String v) {
        for (TcodeTypeBranchtCompteur c: TcodeTypeBranchtCompteur.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
