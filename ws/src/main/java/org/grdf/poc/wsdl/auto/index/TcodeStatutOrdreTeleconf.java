
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeStatutOrdreTeleconf.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeStatutOrdreTeleconf"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cree"/&gt;
 *     &lt;enumeration value="envoye"/&gt;
 *     &lt;enumeration value="enAttente"/&gt;
 *     &lt;enumeration value="succes"/&gt;
 *     &lt;enumeration value="echec"/&gt;
 *     &lt;enumeration value="annule"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeStatutOrdreTeleconf", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeStatutOrdreTeleconf {

    @XmlEnumValue("cree")
    CREE("cree"),
    @XmlEnumValue("envoye")
    ENVOYE("envoye"),
    @XmlEnumValue("enAttente")
    EN_ATTENTE("enAttente"),
    @XmlEnumValue("succes")
    SUCCES("succes"),
    @XmlEnumValue("echec")
    ECHEC("echec"),
    @XmlEnumValue("annule")
    ANNULE("annule");
    private final String value;

    TcodeStatutOrdreTeleconf(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeStatutOrdreTeleconf fromValue(String v) {
        for (TcodeStatutOrdreTeleconf c: TcodeStatutOrdreTeleconf.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
