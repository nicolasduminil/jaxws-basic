
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TuniteGeocodage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TuniteGeocodage"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="lambert2e"/&gt;
 *     &lt;enumeration value="WGS84"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TuniteGeocodage", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TuniteGeocodage {

    @XmlEnumValue("lambert2e")
    LAMBERT_2_E("lambert2e"),
    @XmlEnumValue("WGS84")
    WGS_84("WGS84");
    private final String value;

    TuniteGeocodage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TuniteGeocodage fromValue(String v) {
        for (TuniteGeocodage c: TuniteGeocodage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
