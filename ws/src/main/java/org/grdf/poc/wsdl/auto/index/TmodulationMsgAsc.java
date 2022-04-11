
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TmodulationMsgAsc.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TmodulationMsgAsc"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WM-2400"/&gt;
 *     &lt;enumeration value="WM-4800"/&gt;
 *     &lt;enumeration value="WM-HSPEED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TmodulationMsgAsc", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TmodulationMsgAsc {

    @XmlEnumValue("WM-2400")
    WM_2400("WM-2400"),
    @XmlEnumValue("WM-4800")
    WM_4800("WM-4800"),
    @XmlEnumValue("WM-HSPEED")
    WM_HSPEED("WM-HSPEED");
    private final String value;

    TmodulationMsgAsc(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TmodulationMsgAsc fromValue(String v) {
        for (TmodulationMsgAsc c: TmodulationMsgAsc.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
