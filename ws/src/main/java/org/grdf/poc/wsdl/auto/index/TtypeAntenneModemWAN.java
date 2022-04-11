
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TtypeAntenneModemWAN.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TtypeAntenneModemWAN"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Integree_de_type_tige_monopole"/&gt;
 *     &lt;enumeration value="Integree_de_type_tige_dipole"/&gt;
 *     &lt;enumeration value="Deportee_de_type_combo"/&gt;
 *     &lt;enumeration value="Deportee_type_baton"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TtypeAntenneModemWAN", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TtypeAntenneModemWAN {

    @XmlEnumValue("Integree_de_type_tige_monopole")
    INTEGREE_DE_TYPE_TIGE_MONOPOLE("Integree_de_type_tige_monopole"),
    @XmlEnumValue("Integree_de_type_tige_dipole")
    INTEGREE_DE_TYPE_TIGE_DIPOLE("Integree_de_type_tige_dipole"),
    @XmlEnumValue("Deportee_de_type_combo")
    DEPORTEE_DE_TYPE_COMBO("Deportee_de_type_combo"),
    @XmlEnumValue("Deportee_type_baton")
    DEPORTEE_TYPE_BATON("Deportee_type_baton");
    private final String value;

    TtypeAntenneModemWAN(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TtypeAntenneModemWAN fromValue(String v) {
        for (TtypeAntenneModemWAN c: TtypeAntenneModemWAN.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
