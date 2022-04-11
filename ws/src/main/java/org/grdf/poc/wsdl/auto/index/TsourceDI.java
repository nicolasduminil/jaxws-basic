
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TsourceDI.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TsourceDI"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Omega"/&gt;
 *     &lt;enumeration value="MADD"/&gt;
 *     &lt;enumeration value="IhmMADDpourOmega"/&gt;
 *     &lt;enumeration value="PRES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TsourceDI", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TsourceDI {

    @XmlEnumValue("Omega")
    OMEGA("Omega"),
    MADD("MADD"),
    @XmlEnumValue("IhmMADDpourOmega")
    IHM_MAD_DPOUR_OMEGA("IhmMADDpourOmega"),
    PRES("PRES");
    private final String value;

    TsourceDI(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TsourceDI fromValue(String v) {
        for (TsourceDI c: TsourceDI.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
