
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeEtatPlanification.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeEtatPlanification"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="nonPlanifie"/&gt;
 *     &lt;enumeration value="strategique"/&gt;
 *     &lt;enumeration value="operationnel"/&gt;
 *     &lt;enumeration value="deploye"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeEtatPlanification", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeEtatPlanification {

    @XmlEnumValue("nonPlanifie")
    NON_PLANIFIE("nonPlanifie"),
    @XmlEnumValue("strategique")
    STRATEGIQUE("strategique"),
    @XmlEnumValue("operationnel")
    OPERATIONNEL("operationnel"),
    @XmlEnumValue("deploye")
    DEPLOYE("deploye");
    private final String value;

    TcodeEtatPlanification(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeEtatPlanification fromValue(String v) {
        for (TcodeEtatPlanification c: TcodeEtatPlanification.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
