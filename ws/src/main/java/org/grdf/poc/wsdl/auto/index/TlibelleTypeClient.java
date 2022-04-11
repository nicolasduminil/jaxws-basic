
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TlibelleTypeClient.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TlibelleTypeClient"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="professionnel"/&gt;
 *     &lt;enumeration value="particulier"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TlibelleTypeClient", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TlibelleTypeClient {

    @XmlEnumValue("professionnel")
    PROFESSIONNEL("professionnel"),
    @XmlEnumValue("particulier")
    PARTICULIER("particulier");
    private final String value;

    TlibelleTypeClient(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TlibelleTypeClient fromValue(String v) {
        for (TlibelleTypeClient c: TlibelleTypeClient.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
