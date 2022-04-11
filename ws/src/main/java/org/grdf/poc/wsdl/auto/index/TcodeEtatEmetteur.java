
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeEtatEmetteur.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeEtatEmetteur"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Signale"/&gt;
 *     &lt;enumeration value="Pose"/&gt;
 *     &lt;enumeration value="Communicant"/&gt;
 *     &lt;enumeration value="Non_communicant"/&gt;
 *     &lt;enumeration value="Operationnel"/&gt;
 *     &lt;enumeration value="Non_operationnel"/&gt;
 *     &lt;enumeration value="Degrade"/&gt;
 *     &lt;enumeration value="Depose"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeEtatEmetteur", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeEtatEmetteur {

    @XmlEnumValue("Signale")
    SIGNALE("Signale"),
    @XmlEnumValue("Pose")
    POSE("Pose"),
    @XmlEnumValue("Communicant")
    COMMUNICANT("Communicant"),
    @XmlEnumValue("Non_communicant")
    NON_COMMUNICANT("Non_communicant"),
    @XmlEnumValue("Operationnel")
    OPERATIONNEL("Operationnel"),
    @XmlEnumValue("Non_operationnel")
    NON_OPERATIONNEL("Non_operationnel"),
    @XmlEnumValue("Degrade")
    DEGRADE("Degrade"),
    @XmlEnumValue("Depose")
    DEPOSE("Depose");
    private final String value;

    TcodeEtatEmetteur(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeEtatEmetteur fromValue(String v) {
        for (TcodeEtatEmetteur c: TcodeEtatEmetteur.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
