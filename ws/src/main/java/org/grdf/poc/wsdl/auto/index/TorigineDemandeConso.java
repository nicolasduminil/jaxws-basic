
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TorigineDemandeConso.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TorigineDemandeConso"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="fournisseur"/&gt;
 *     &lt;enumeration value="clientFinal"/&gt;
 *     &lt;enumeration value="interne"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TorigineDemandeConso", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TorigineDemandeConso {

    @XmlEnumValue("fournisseur")
    FOURNISSEUR("fournisseur"),
    @XmlEnumValue("clientFinal")
    CLIENT_FINAL("clientFinal"),
    @XmlEnumValue("interne")
    INTERNE("interne");
    private final String value;

    TorigineDemandeConso(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TorigineDemandeConso fromValue(String v) {
        for (TorigineDemandeConso c: TorigineDemandeConso.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
