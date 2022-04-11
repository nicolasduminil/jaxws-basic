
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeOrigineConso.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeOrigineConso"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CYC"/&gt;
 *     &lt;enumeration value="EVT"/&gt;
 *     &lt;enumeration value="ITM"/&gt;
 *     &lt;enumeration value="INF"/&gt;
 *     &lt;enumeration value="PRO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeOrigineConso", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeOrigineConso {

    CYC,
    EVT,
    ITM,
    INF,
    PRO;

    public String value() {
        return name();
    }

    public static TcodeOrigineConso fromValue(String v) {
        return valueOf(v);
    }

}
