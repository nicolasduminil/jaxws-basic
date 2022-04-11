
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeEtatModemLAN.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeEtatModemLAN"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ON"/&gt;
 *     &lt;enumeration value="OFF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeEtatModemLAN", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeEtatModemLAN {

    ON,
    OFF;

    public String value() {
        return name();
    }

    public static TcodeEtatModemLAN fromValue(String v) {
        return valueOf(v);
    }

}
