
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeFrequenceTransmission.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeFrequenceTransmission"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="mensuelle"/&gt;
 *     &lt;enumeration value="semestrielle"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeFrequenceTransmission", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeFrequenceTransmission {

    @XmlEnumValue("mensuelle")
    MENSUELLE("mensuelle"),
    @XmlEnumValue("semestrielle")
    SEMESTRIELLE("semestrielle");
    private final String value;

    TcodeFrequenceTransmission(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeFrequenceTransmission fromValue(String v) {
        for (TcodeFrequenceTransmission c: TcodeFrequenceTransmission.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
