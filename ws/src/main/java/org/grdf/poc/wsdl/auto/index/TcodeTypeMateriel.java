
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeTypeMateriel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeTypeMateriel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="compteur"/&gt;
 *     &lt;enumeration value="emetteur"/&gt;
 *     &lt;enumeration value="compteurEtEmetteur"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeTypeMateriel", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeTypeMateriel {

    @XmlEnumValue("compteur")
    COMPTEUR("compteur"),
    @XmlEnumValue("emetteur")
    EMETTEUR("emetteur"),
    @XmlEnumValue("compteurEtEmetteur")
    COMPTEUR_ET_EMETTEUR("compteurEtEmetteur");
    private final String value;

    TcodeTypeMateriel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeTypeMateriel fromValue(String v) {
        for (TcodeTypeMateriel c: TcodeTypeMateriel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
