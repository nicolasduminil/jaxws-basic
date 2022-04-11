
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeEtatUC.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeEtatUC"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Receptionne"/&gt;
 *     &lt;enumeration value="Pose"/&gt;
 *     &lt;enumeration value="Communicant"/&gt;
 *     &lt;enumeration value="Operationnel"/&gt;
 *     &lt;enumeration value="NonOperationnel"/&gt;
 *     &lt;enumeration value="Depose"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeEtatUC", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeEtatUC {

    @XmlEnumValue("Receptionne")
    RECEPTIONNE("Receptionne"),
    @XmlEnumValue("Pose")
    POSE("Pose"),
    @XmlEnumValue("Communicant")
    COMMUNICANT("Communicant"),
    @XmlEnumValue("Operationnel")
    OPERATIONNEL("Operationnel"),
    @XmlEnumValue("NonOperationnel")
    NON_OPERATIONNEL("NonOperationnel"),
    @XmlEnumValue("Depose")
    DEPOSE("Depose");
    private final String value;

    TcodeEtatUC(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeEtatUC fromValue(String v) {
        for (TcodeEtatUC c: TcodeEtatUC.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
