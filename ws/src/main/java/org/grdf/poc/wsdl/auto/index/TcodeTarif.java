
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeTarif.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeTarif"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="typeDeTarifGestionDechets"/&gt;
 *     &lt;enumeration value="typeDeTarifElectricite1"/&gt;
 *     &lt;enumeration value="typeDeTarifGaz1"/&gt;
 *     &lt;enumeration value="grosClient"/&gt;
 *     &lt;enumeration value="tarifT1"/&gt;
 *     &lt;enumeration value="tarifT2"/&gt;
 *     &lt;enumeration value="tarifT3"/&gt;
 *     &lt;enumeration value="tarifT4"/&gt;
 *     &lt;enumeration value="propane"/&gt;
 *     &lt;enumeration value="tarifTF"/&gt;
 *     &lt;enumeration value="tarifTP"/&gt;
 *     &lt;enumeration value="tarifGenerique"/&gt;
 *     &lt;enumeration value="typeDeTarifEau1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeTarif", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeTarif {

    @XmlEnumValue("typeDeTarifGestionDechets")
    TYPE_DE_TARIF_GESTION_DECHETS("typeDeTarifGestionDechets"),
    @XmlEnumValue("typeDeTarifElectricite1")
    TYPE_DE_TARIF_ELECTRICITE_1("typeDeTarifElectricite1"),
    @XmlEnumValue("typeDeTarifGaz1")
    TYPE_DE_TARIF_GAZ_1("typeDeTarifGaz1"),
    @XmlEnumValue("grosClient")
    GROS_CLIENT("grosClient"),
    @XmlEnumValue("tarifT1")
    TARIF_T_1("tarifT1"),
    @XmlEnumValue("tarifT2")
    TARIF_T_2("tarifT2"),
    @XmlEnumValue("tarifT3")
    TARIF_T_3("tarifT3"),
    @XmlEnumValue("tarifT4")
    TARIF_T_4("tarifT4"),
    @XmlEnumValue("propane")
    PROPANE("propane"),
    @XmlEnumValue("tarifTF")
    TARIF_TF("tarifTF"),
    @XmlEnumValue("tarifTP")
    TARIF_TP("tarifTP"),
    @XmlEnumValue("tarifGenerique")
    TARIF_GENERIQUE("tarifGenerique"),
    @XmlEnumValue("typeDeTarifEau1")
    TYPE_DE_TARIF_EAU_1("typeDeTarifEau1");
    private final String value;

    TcodeTarif(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeTarif fromValue(String v) {
        for (TcodeTarif c: TcodeTarif.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
