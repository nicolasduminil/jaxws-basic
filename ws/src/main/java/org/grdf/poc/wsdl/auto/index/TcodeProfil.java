
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeProfil.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeProfil"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="P000"/&gt;
 *     &lt;enumeration value="P011"/&gt;
 *     &lt;enumeration value="P012"/&gt;
 *     &lt;enumeration value="P013"/&gt;
 *     &lt;enumeration value="P014"/&gt;
 *     &lt;enumeration value="P015"/&gt;
 *     &lt;enumeration value="P016"/&gt;
 *     &lt;enumeration value="P017"/&gt;
 *     &lt;enumeration value="P018"/&gt;
 *     &lt;enumeration value="P019"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeProfil", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeProfil {

    @XmlEnumValue("P000")
    P_000("P000"),
    @XmlEnumValue("P011")
    P_011("P011"),
    @XmlEnumValue("P012")
    P_012("P012"),
    @XmlEnumValue("P013")
    P_013("P013"),
    @XmlEnumValue("P014")
    P_014("P014"),
    @XmlEnumValue("P015")
    P_015("P015"),
    @XmlEnumValue("P016")
    P_016("P016"),
    @XmlEnumValue("P017")
    P_017("P017"),
    @XmlEnumValue("P018")
    P_018("P018"),
    @XmlEnumValue("P019")
    P_019("P019");
    private final String value;

    TcodeProfil(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeProfil fromValue(String v) {
        for (TcodeProfil c: TcodeProfil.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
