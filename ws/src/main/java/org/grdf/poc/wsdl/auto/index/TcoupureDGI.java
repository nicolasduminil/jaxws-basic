
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcoupureDGI.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcoupureDGI"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="dangerGrave"/&gt;
 *     &lt;enumeration value="localSur"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcoupureDGI", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcoupureDGI {

    @XmlEnumValue("dangerGrave")
    DANGER_GRAVE("dangerGrave"),
    @XmlEnumValue("localSur")
    LOCAL_SUR("localSur");
    private final String value;

    TcoupureDGI(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcoupureDGI fromValue(String v) {
        for (TcoupureDGI c: TcoupureDGI.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
