
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeTypeDemandeClient.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeTypeDemandeClient"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="demandeInformation"/&gt;
 *     &lt;enumeration value="demandeModificationRDV"/&gt;
 *     &lt;enumeration value="demandeReclamation"/&gt;
 *     &lt;enumeration value="enqueteSatisfaction"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeTypeDemandeClient", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeTypeDemandeClient {

    @XmlEnumValue("demandeInformation")
    DEMANDE_INFORMATION("demandeInformation"),
    @XmlEnumValue("demandeModificationRDV")
    DEMANDE_MODIFICATION_RDV("demandeModificationRDV"),
    @XmlEnumValue("demandeReclamation")
    DEMANDE_RECLAMATION("demandeReclamation"),
    @XmlEnumValue("enqueteSatisfaction")
    ENQUETE_SATISFACTION("enqueteSatisfaction");
    private final String value;

    TcodeTypeDemandeClient(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeTypeDemandeClient fromValue(String v) {
        for (TcodeTypeDemandeClient c: TcodeTypeDemandeClient.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
