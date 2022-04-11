
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TsourceNotificationCRI.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TsourceNotificationCRI"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CRI_Pose"/&gt;
 *     &lt;enumeration value="CRI_Refus"/&gt;
 *     &lt;enumeration value="CRI_Qualite"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TsourceNotificationCRI", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TsourceNotificationCRI {

    @XmlEnumValue("CRI_Pose")
    CRI_POSE("CRI_Pose"),
    @XmlEnumValue("CRI_Refus")
    CRI_REFUS("CRI_Refus"),
    @XmlEnumValue("CRI_Qualite")
    CRI_QUALITE("CRI_Qualite");
    private final String value;

    TsourceNotificationCRI(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TsourceNotificationCRI fromValue(String v) {
        for (TsourceNotificationCRI c: TsourceNotificationCRI.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
