
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TorigineAutoReleve.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TorigineAutoReleve"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="fournisseur"/&gt;
 *     &lt;enumeration value="interne"/&gt;
 *     &lt;enumeration value="clientFinal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TorigineAutoReleve", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TorigineAutoReleve {

    @XmlEnumValue("fournisseur")
    FOURNISSEUR("fournisseur"),
    @XmlEnumValue("interne")
    INTERNE("interne"),
    @XmlEnumValue("clientFinal")
    CLIENT_FINAL("clientFinal");
    private final String value;

    TorigineAutoReleve(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TorigineAutoReleve fromValue(String v) {
        for (TorigineAutoReleve c: TorigineAutoReleve.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
