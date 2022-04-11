
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeTypeIntervention.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeTypeIntervention"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="pose"/&gt;
 *     &lt;enumeration value="depose"/&gt;
 *     &lt;enumeration value="remplacement"/&gt;
 *     &lt;enumeration value="interventionSurExistant"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeTypeIntervention", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeTypeIntervention {

    @XmlEnumValue("pose")
    POSE("pose"),
    @XmlEnumValue("depose")
    DEPOSE("depose"),
    @XmlEnumValue("remplacement")
    REMPLACEMENT("remplacement"),
    @XmlEnumValue("interventionSurExistant")
    INTERVENTION_SUR_EXISTANT("interventionSurExistant");
    private final String value;

    TcodeTypeIntervention(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeTypeIntervention fromValue(String v) {
        for (TcodeTypeIntervention c: TcodeTypeIntervention.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
