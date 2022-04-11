
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tcanal.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Tcanal"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Web"/&gt;
 *     &lt;enumeration value="Push"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Tcanal", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum Tcanal {

    @XmlEnumValue("Web")
    WEB("Web"),
    @XmlEnumValue("Push")
    PUSH("Push");
    private final String value;

    Tcanal(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Tcanal fromValue(String v) {
        for (Tcanal c: Tcanal.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
