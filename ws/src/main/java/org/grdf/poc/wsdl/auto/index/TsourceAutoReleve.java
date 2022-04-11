
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TsourceAutoReleve.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TsourceAutoReleve"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Omega"/&gt;
 *     &lt;enumeration value="PortailClient"/&gt;
 *     &lt;enumeration value="SVI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TsourceAutoReleve", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TsourceAutoReleve {

    @XmlEnumValue("Omega")
    OMEGA("Omega"),
    @XmlEnumValue("PortailClient")
    PORTAIL_CLIENT("PortailClient"),
    SVI("SVI");
    private final String value;

    TsourceAutoReleve(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TsourceAutoReleve fromValue(String v) {
        for (TsourceAutoReleve c: TsourceAutoReleve.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
