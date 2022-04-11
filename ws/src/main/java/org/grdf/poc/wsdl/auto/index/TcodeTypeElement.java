
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeTypeElement.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeTypeElement"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="blocAlimentation"/&gt;
 *     &lt;enumeration value="convertisseur"/&gt;
 *     &lt;enumeration value="disjoncteur"/&gt;
 *     &lt;enumeration value="parasurtenseur"/&gt;
 *     &lt;enumeration value="carteDeBrassage"/&gt;
 *     &lt;enumeration value="uniteCentrale"/&gt;
 *     &lt;enumeration value="moduleGPS"/&gt;
 *     &lt;enumeration value="antenneLAN"/&gt;
 *     &lt;enumeration value="antenneGPS"/&gt;
 *     &lt;enumeration value="antenneWAN"/&gt;
 *     &lt;enumeration value="modemWAN"/&gt;
 *     &lt;enumeration value="modemLAN"/&gt;
 *     &lt;enumeration value="carteSIM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeTypeElement", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeTypeElement {

    @XmlEnumValue("blocAlimentation")
    BLOC_ALIMENTATION("blocAlimentation"),
    @XmlEnumValue("convertisseur")
    CONVERTISSEUR("convertisseur"),
    @XmlEnumValue("disjoncteur")
    DISJONCTEUR("disjoncteur"),
    @XmlEnumValue("parasurtenseur")
    PARASURTENSEUR("parasurtenseur"),
    @XmlEnumValue("carteDeBrassage")
    CARTE_DE_BRASSAGE("carteDeBrassage"),
    @XmlEnumValue("uniteCentrale")
    UNITE_CENTRALE("uniteCentrale"),
    @XmlEnumValue("moduleGPS")
    MODULE_GPS("moduleGPS"),
    @XmlEnumValue("antenneLAN")
    ANTENNE_LAN("antenneLAN"),
    @XmlEnumValue("antenneGPS")
    ANTENNE_GPS("antenneGPS"),
    @XmlEnumValue("antenneWAN")
    ANTENNE_WAN("antenneWAN"),
    @XmlEnumValue("modemWAN")
    MODEM_WAN("modemWAN"),
    @XmlEnumValue("modemLAN")
    MODEM_LAN("modemLAN"),
    @XmlEnumValue("carteSIM")
    CARTE_SIM("carteSIM");
    private final String value;

    TcodeTypeElement(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeTypeElement fromValue(String v) {
        for (TcodeTypeElement c: TcodeTypeElement.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
