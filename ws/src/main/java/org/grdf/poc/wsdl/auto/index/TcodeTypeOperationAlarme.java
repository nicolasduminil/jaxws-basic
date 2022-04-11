
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeTypeOperationAlarme.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeTypeOperationAlarme"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ajout"/&gt;
 *     &lt;enumeration value="cloture"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeTypeOperationAlarme", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeTypeOperationAlarme {

    @XmlEnumValue("ajout")
    AJOUT("ajout"),
    @XmlEnumValue("cloture")
    CLOTURE("cloture");
    private final String value;

    TcodeTypeOperationAlarme(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeTypeOperationAlarme fromValue(String v) {
        for (TcodeTypeOperationAlarme c: TcodeTypeOperationAlarme.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
