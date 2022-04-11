
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TmodeCalcul.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TmodeCalcul"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="mode1"/&gt;
 *     &lt;enumeration value="mode2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TmodeCalcul", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TmodeCalcul {

    @XmlEnumValue("mode1")
    MODE_1("mode1"),
    @XmlEnumValue("mode2")
    MODE_2("mode2");
    private final String value;

    TmodeCalcul(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TmodeCalcul fromValue(String v) {
        for (TmodeCalcul c: TmodeCalcul.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
