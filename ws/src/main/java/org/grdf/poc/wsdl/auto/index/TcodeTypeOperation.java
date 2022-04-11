
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeTypeOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeTypeOperation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="creation"/&gt;
 *     &lt;enumeration value="modification"/&gt;
 *     &lt;enumeration value="suppression"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeTypeOperation", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeTypeOperation {

    @XmlEnumValue("creation")
    CREATION("creation"),
    @XmlEnumValue("modification")
    MODIFICATION("modification"),
    @XmlEnumValue("suppression")
    SUPPRESSION("suppression");
    private final String value;

    TcodeTypeOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeTypeOperation fromValue(String v) {
        for (TcodeTypeOperation c: TcodeTypeOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
