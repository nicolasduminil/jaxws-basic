
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TtypeAntenneModemLAN.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TtypeAntenneModemLAN"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Courte_de_type_baton"/&gt;
 *     &lt;enumeration value="Omnidirectionnelle_5dBi"/&gt;
 *     &lt;enumeration value="Omnidirectionnelle_demi-onde"/&gt;
 *     &lt;enumeration value="Sectorielle_type_YAGI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TtypeAntenneModemLAN", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TtypeAntenneModemLAN {

    @XmlEnumValue("Courte_de_type_baton")
    COURTE_DE_TYPE_BATON("Courte_de_type_baton"),
    @XmlEnumValue("Omnidirectionnelle_5dBi")
    OMNIDIRECTIONNELLE_5_D_BI("Omnidirectionnelle_5dBi"),
    @XmlEnumValue("Omnidirectionnelle_demi-onde")
    OMNIDIRECTIONNELLE_DEMI_ONDE("Omnidirectionnelle_demi-onde"),
    @XmlEnumValue("Sectorielle_type_YAGI")
    SECTORIELLE_TYPE_YAGI("Sectorielle_type_YAGI");
    private final String value;

    TtypeAntenneModemLAN(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TtypeAntenneModemLAN fromValue(String v) {
        for (TtypeAntenneModemLAN c: TtypeAntenneModemLAN.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
