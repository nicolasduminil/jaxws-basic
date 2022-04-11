
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeEtatComm.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeEtatComm"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="initialise"/&gt;
 *     &lt;enumeration value="equipe"/&gt;
 *     &lt;enumeration value="non equipe"/&gt;
 *     &lt;enumeration value="reconcilie"/&gt;
 *     &lt;enumeration value="ASRAP"/&gt;
 *     &lt;enumeration value="echecTelereleve"/&gt;
 *     &lt;enumeration value="telereleve"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeEtatComm", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeEtatComm {

    @XmlEnumValue("initialise")
    INITIALISE("initialise"),
    @XmlEnumValue("equipe")
    EQUIPE("equipe"),
    @XmlEnumValue("non equipe")
    NON_EQUIPE("non equipe"),
    @XmlEnumValue("reconcilie")
    RECONCILIE("reconcilie"),
    ASRAP("ASRAP"),
    @XmlEnumValue("echecTelereleve")
    ECHEC_TELERELEVE("echecTelereleve"),
    @XmlEnumValue("telereleve")
    TELERELEVE("telereleve");
    private final String value;

    TcodeEtatComm(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeEtatComm fromValue(String v) {
        for (TcodeEtatComm c: TcodeEtatComm.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
