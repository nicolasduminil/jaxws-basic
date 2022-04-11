
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeFrequenceAbonnement.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeFrequenceAbonnement"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="mensuel"/&gt;
 *     &lt;enumeration value="semestriel"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeFrequenceAbonnement", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeFrequenceAbonnement {

    @XmlEnumValue("mensuel")
    MENSUEL("mensuel"),
    @XmlEnumValue("semestriel")
    SEMESTRIEL("semestriel");
    private final String value;

    TcodeFrequenceAbonnement(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeFrequenceAbonnement fromValue(String v) {
        for (TcodeFrequenceAbonnement c: TcodeFrequenceAbonnement.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
