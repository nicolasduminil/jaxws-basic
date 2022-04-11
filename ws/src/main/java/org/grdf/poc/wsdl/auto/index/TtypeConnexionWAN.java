
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TtypeConnexionWAN.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TtypeConnexionWAN"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="radio"/&gt;
 *     &lt;enumeration value="filaire"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TtypeConnexionWAN", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TtypeConnexionWAN {

    @XmlEnumValue("radio")
    RADIO("radio"),
    @XmlEnumValue("filaire")
    FILAIRE("filaire");
    private final String value;

    TtypeConnexionWAN(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TtypeConnexionWAN fromValue(String v) {
        for (TtypeConnexionWAN c: TtypeConnexionWAN.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
