
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeStatutDI.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeStatutDI"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="nonRecevable"/&gt;
 *     &lt;enumeration value="priseEnCompte"/&gt;
 *     &lt;enumeration value="enAttenteDeRealisation"/&gt;
 *     &lt;enumeration value="realisee"/&gt;
 *     &lt;enumeration value="enAttenteExpiration"/&gt;
 *     &lt;enumeration value="expiree"/&gt;
 *     &lt;enumeration value="annulee"/&gt;
 *     &lt;enumeration value="abandonnee"/&gt;
 *     &lt;enumeration value="echecExpiration"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeStatutDI", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeStatutDI {

    @XmlEnumValue("nonRecevable")
    NON_RECEVABLE("nonRecevable"),
    @XmlEnumValue("priseEnCompte")
    PRISE_EN_COMPTE("priseEnCompte"),
    @XmlEnumValue("enAttenteDeRealisation")
    EN_ATTENTE_DE_REALISATION("enAttenteDeRealisation"),
    @XmlEnumValue("realisee")
    REALISEE("realisee"),
    @XmlEnumValue("enAttenteExpiration")
    EN_ATTENTE_EXPIRATION("enAttenteExpiration"),
    @XmlEnumValue("expiree")
    EXPIREE("expiree"),
    @XmlEnumValue("annulee")
    ANNULEE("annulee"),
    @XmlEnumValue("abandonnee")
    ABANDONNEE("abandonnee"),
    @XmlEnumValue("echecExpiration")
    ECHEC_EXPIRATION("echecExpiration");
    private final String value;

    TcodeStatutDI(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeStatutDI fromValue(String v) {
        for (TcodeStatutDI c: TcodeStatutDI.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
