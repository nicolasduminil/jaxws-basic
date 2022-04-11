
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TetatCapteur.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TetatCapteur"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="signal_normal"/&gt;
 *     &lt;enumeration value="signal_trop_faible"/&gt;
 *     &lt;enumeration value="signal_faible"/&gt;
 *     &lt;enumeration value="signal_trop_fort"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TetatCapteur", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TetatCapteur {

    @XmlEnumValue("signal_normal")
    SIGNAL_NORMAL("signal_normal"),
    @XmlEnumValue("signal_trop_faible")
    SIGNAL_TROP_FAIBLE("signal_trop_faible"),
    @XmlEnumValue("signal_faible")
    SIGNAL_FAIBLE("signal_faible"),
    @XmlEnumValue("signal_trop_fort")
    SIGNAL_TROP_FORT("signal_trop_fort");
    private final String value;

    TetatCapteur(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TetatCapteur fromValue(String v) {
        for (TetatCapteur c: TetatCapteur.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
