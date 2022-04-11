
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeTypeOperationCalendrier.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeTypeOperationCalendrier"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="miseAJourCalendrier"/&gt;
 *     &lt;enumeration value="releveADate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeTypeOperationCalendrier", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeTypeOperationCalendrier {

    @XmlEnumValue("miseAJourCalendrier")
    MISE_A_JOUR_CALENDRIER("miseAJourCalendrier"),
    @XmlEnumValue("releveADate")
    RELEVE_A_DATE("releveADate");
    private final String value;

    TcodeTypeOperationCalendrier(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeTypeOperationCalendrier fromValue(String v) {
        for (TcodeTypeOperationCalendrier c: TcodeTypeOperationCalendrier.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
