
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeStatutDemande.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeStatutDemande"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="recevable"/&gt;
 *     &lt;enumeration value="nonRecevable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeStatutDemande", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeStatutDemande {

    @XmlEnumValue("recevable")
    RECEVABLE("recevable"),
    @XmlEnumValue("nonRecevable")
    NON_RECEVABLE("nonRecevable");
    private final String value;

    TcodeStatutDemande(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeStatutDemande fromValue(String v) {
        for (TcodeStatutDemande c: TcodeStatutDemande.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
