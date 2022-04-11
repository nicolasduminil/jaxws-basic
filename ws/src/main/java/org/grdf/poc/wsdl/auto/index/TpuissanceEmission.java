
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpuissanceEmission.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TpuissanceEmission"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PMax"/&gt;
 *     &lt;enumeration value="PMax-6db"/&gt;
 *     &lt;enumeration value="PMax-12db"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpuissanceEmission", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TpuissanceEmission {

    @XmlEnumValue("PMax")
    P_MAX("PMax"),
    @XmlEnumValue("PMax-6db")
    P_MAX_6_DB("PMax-6db"),
    @XmlEnumValue("PMax-12db")
    P_MAX_12_DB("PMax-12db");
    private final String value;

    TpuissanceEmission(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TpuissanceEmission fromValue(String v) {
        for (TpuissanceEmission c: TpuissanceEmission.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
