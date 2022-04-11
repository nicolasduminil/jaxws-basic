
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeTypeCoefPTA.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeTypeCoefPTA"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="calcule"/&gt;
 *     &lt;enumeration value="corrige"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeTypeCoefPTA", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeTypeCoefPTA {

    @XmlEnumValue("calcule")
    CALCULE("calcule"),
    @XmlEnumValue("corrige")
    CORRIGE("corrige");
    private final String value;

    TcodeTypeCoefPTA(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeTypeCoefPTA fromValue(String v) {
        for (TcodeTypeCoefPTA c: TcodeTypeCoefPTA.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
