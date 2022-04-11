
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeStatutDemandeClient.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeStatutDemandeClient"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="prisEnCharge"/&gt;
 *     &lt;enumeration value="traite"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeStatutDemandeClient", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeStatutDemandeClient {

    @XmlEnumValue("prisEnCharge")
    PRIS_EN_CHARGE("prisEnCharge"),
    @XmlEnumValue("traite")
    TRAITE("traite");
    private final String value;

    TcodeStatutDemandeClient(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeStatutDemandeClient fromValue(String v) {
        for (TcodeStatutDemandeClient c: TcodeStatutDemandeClient.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
