
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TtypeCom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TtypeCom"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="courrier"/&gt;
 *     &lt;enumeration value="sms"/&gt;
 *     &lt;enumeration value="email"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TtypeCom", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TtypeCom {

    @XmlEnumValue("courrier")
    COURRIER("courrier"),
    @XmlEnumValue("sms")
    SMS("sms"),
    @XmlEnumValue("email")
    EMAIL("email");
    private final String value;

    TtypeCom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TtypeCom fromValue(String v) {
        for (TtypeCom c: TtypeCom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
