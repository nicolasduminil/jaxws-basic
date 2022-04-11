
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeTypeAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeTypeAction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ajout"/&gt;
 *     &lt;enumeration value="suppression"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeTypeAction", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeTypeAction {

    @XmlEnumValue("ajout")
    AJOUT("ajout"),
    @XmlEnumValue("suppression")
    SUPPRESSION("suppression");
    private final String value;

    TcodeTypeAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeTypeAction fromValue(String v) {
        for (TcodeTypeAction c: TcodeTypeAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
