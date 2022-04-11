
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TsourceDemandeConso.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TsourceDemandeConso"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Omega"/&gt;
 *     &lt;enumeration value="PortailClient"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TsourceDemandeConso", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TsourceDemandeConso {

    @XmlEnumValue("Omega")
    OMEGA("Omega"),
    @XmlEnumValue("PortailClient")
    PORTAIL_CLIENT("PortailClient");
    private final String value;

    TsourceDemandeConso(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TsourceDemandeConso fromValue(String v) {
        for (TsourceDemandeConso c: TsourceDemandeConso.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
