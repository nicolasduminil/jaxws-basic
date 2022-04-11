
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TsystemeSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TsystemeSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SUP"/&gt;
 *     &lt;enumeration value="PQR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TsystemeSource", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TsystemeSource {

    SUP,
    PQR;

    public String value() {
        return name();
    }

    public static TsystemeSource fromValue(String v) {
        return valueOf(v);
    }

}
