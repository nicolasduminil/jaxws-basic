
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeTypeInstallationModuleRadio.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeTypeInstallationModuleRadio"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="faceAvant"/&gt;
 *     &lt;enumeration value="enCoffret"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeTypeInstallationModuleRadio", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeTypeInstallationModuleRadio {

    @XmlEnumValue("faceAvant")
    FACE_AVANT("faceAvant"),
    @XmlEnumValue("enCoffret")
    EN_COFFRET("enCoffret");
    private final String value;

    TcodeTypeInstallationModuleRadio(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeTypeInstallationModuleRadio fromValue(String v) {
        for (TcodeTypeInstallationModuleRadio c: TcodeTypeInstallationModuleRadio.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
