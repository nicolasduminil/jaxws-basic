
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeContexteApplication.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeContexteApplication"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SIAS"/&gt;
 *     &lt;enumeration value="TICC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeContexteApplication", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeContexteApplication {

    SIAS,
    TICC;

    public String value() {
        return name();
    }

    public static TcodeContexteApplication fromValue(String v) {
        return valueOf(v);
    }

}
