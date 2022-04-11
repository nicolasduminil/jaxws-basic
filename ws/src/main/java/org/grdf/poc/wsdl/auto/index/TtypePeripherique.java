
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TtypePeripherique.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TtypePeripherique"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="modemLAN"/&gt;
 *     &lt;enumeration value="modemWAN"/&gt;
 *     &lt;enumeration value="moduleGPS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TtypePeripherique", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TtypePeripherique {

    @XmlEnumValue("modemLAN")
    MODEM_LAN("modemLAN"),
    @XmlEnumValue("modemWAN")
    MODEM_WAN("modemWAN"),
    @XmlEnumValue("moduleGPS")
    MODULE_GPS("moduleGPS");
    private final String value;

    TtypePeripherique(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TtypePeripherique fromValue(String v) {
        for (TtypePeripherique c: TtypePeripherique.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
