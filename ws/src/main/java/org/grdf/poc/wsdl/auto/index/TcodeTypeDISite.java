
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeTypeDISite.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeTypeDISite"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="deploiement"/&gt;
 *     &lt;enumeration value="maintenanceCorrective"/&gt;
 *     &lt;enumeration value="maintenancePreventive"/&gt;
 *     &lt;enumeration value="depose"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeTypeDISite", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeTypeDISite {

    @XmlEnumValue("deploiement")
    DEPLOIEMENT("deploiement"),
    @XmlEnumValue("maintenanceCorrective")
    MAINTENANCE_CORRECTIVE("maintenanceCorrective"),
    @XmlEnumValue("maintenancePreventive")
    MAINTENANCE_PREVENTIVE("maintenancePreventive"),
    @XmlEnumValue("depose")
    DEPOSE("depose");
    private final String value;

    TcodeTypeDISite(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeTypeDISite fromValue(String v) {
        for (TcodeTypeDISite c: TcodeTypeDISite.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
