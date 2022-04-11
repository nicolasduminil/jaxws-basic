
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TstatutCommande.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TstatutCommande"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="enregistree"/&gt;
 *     &lt;enumeration value="confirmee"/&gt;
 *     &lt;enumeration value="priseEnCompte"/&gt;
 *     &lt;enumeration value="livree"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TstatutCommande", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TstatutCommande {

    @XmlEnumValue("enregistree")
    ENREGISTREE("enregistree"),
    @XmlEnumValue("confirmee")
    CONFIRMEE("confirmee"),
    @XmlEnumValue("priseEnCompte")
    PRISE_EN_COMPTE("priseEnCompte"),
    @XmlEnumValue("livree")
    LIVREE("livree");
    private final String value;

    TstatutCommande(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TstatutCommande fromValue(String v) {
        for (TstatutCommande c: TstatutCommande.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
