
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeStatutIncident.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeStatutIncident"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ouvert"/&gt;
 *     &lt;enumeration value="enCours"/&gt;
 *     &lt;enumeration value="enAttente"/&gt;
 *     &lt;enumeration value="clos"/&gt;
 *     &lt;enumeration value="abandonne"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeStatutIncident", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeStatutIncident {

    @XmlEnumValue("ouvert")
    OUVERT("ouvert"),
    @XmlEnumValue("enCours")
    EN_COURS("enCours"),
    @XmlEnumValue("enAttente")
    EN_ATTENTE("enAttente"),
    @XmlEnumValue("clos")
    CLOS("clos"),
    @XmlEnumValue("abandonne")
    ABANDONNE("abandonne");
    private final String value;

    TcodeStatutIncident(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeStatutIncident fromValue(String v) {
        for (TcodeStatutIncident c: TcodeStatutIncident.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
