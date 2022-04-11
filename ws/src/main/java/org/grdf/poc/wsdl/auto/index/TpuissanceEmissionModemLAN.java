
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpuissanceEmissionModemLAN.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TpuissanceEmissionModemLAN"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PMax"/&gt;
 *     &lt;enumeration value="PMax-3dB"/&gt;
 *     &lt;enumeration value="PMax-6dB"/&gt;
 *     &lt;enumeration value="PMax-9dB"/&gt;
 *     &lt;enumeration value="PMax-12dB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpuissanceEmissionModemLAN", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TpuissanceEmissionModemLAN {

    @XmlEnumValue("PMax")
    P_MAX("PMax"),
    @XmlEnumValue("PMax-3dB")
    P_MAX_3_D_B("PMax-3dB"),
    @XmlEnumValue("PMax-6dB")
    P_MAX_6_D_B("PMax-6dB"),
    @XmlEnumValue("PMax-9dB")
    P_MAX_9_D_B("PMax-9dB"),
    @XmlEnumValue("PMax-12dB")
    P_MAX_12_D_B("PMax-12dB");
    private final String value;

    TpuissanceEmissionModemLAN(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpuissanceEmissionModemLAN fromValue(String v) {
        for (TpuissanceEmissionModemLAN c: TpuissanceEmissionModemLAN.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
