
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TtypeAntenneModuleGPS.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TtypeAntenneModuleGPS"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Integree_de_type_patch"/&gt;
 *     &lt;enumeration value="Deportee_de_type_combo"/&gt;
 *     &lt;enumeration value="Deportee_amplifiee"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TtypeAntenneModuleGPS", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TtypeAntenneModuleGPS {

    @XmlEnumValue("Integree_de_type_patch")
    INTEGREE_DE_TYPE_PATCH("Integree_de_type_patch"),
    @XmlEnumValue("Deportee_de_type_combo")
    DEPORTEE_DE_TYPE_COMBO("Deportee_de_type_combo"),
    @XmlEnumValue("Deportee_amplifiee")
    DEPORTEE_AMPLIFIEE("Deportee_amplifiee");
    private final String value;

    TtypeAntenneModuleGPS(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TtypeAntenneModuleGPS fromValue(String v) {
        for (TtypeAntenneModuleGPS c: TtypeAntenneModuleGPS.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
