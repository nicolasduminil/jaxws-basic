
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeTypeOperationPCE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeTypeOperationPCE"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="creation"/&gt;
 *     &lt;enumeration value="suppression"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeTypeOperationPCE", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeTypeOperationPCE {

    @XmlEnumValue("creation")
    CREATION("creation"),
    @XmlEnumValue("suppression")
    SUPPRESSION("suppression");
    private final String value;

    TcodeTypeOperationPCE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeTypeOperationPCE fromValue(String v) {
        for (TcodeTypeOperationPCE c: TcodeTypeOperationPCE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
