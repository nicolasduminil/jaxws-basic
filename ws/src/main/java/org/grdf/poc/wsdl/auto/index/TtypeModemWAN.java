
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TtypeModemWAN.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TtypeModemWAN"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="interne"/&gt;
 *     &lt;enumeration value="externe"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TtypeModemWAN", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TtypeModemWAN {

    @XmlEnumValue("interne")
    INTERNE("interne"),
    @XmlEnumValue("externe")
    EXTERNE("externe");
    private final String value;

    TtypeModemWAN(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TtypeModemWAN fromValue(String v) {
        for (TtypeModemWAN c: TtypeModemWAN.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
