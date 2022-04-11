
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeTypeIndex.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeTypeIndex"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="SUS"/&gt;
 *     &lt;enumeration value="ERR"/&gt;
 *     &lt;enumeration value="ANN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeTypeIndex", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeTypeIndex {

    CON,
    SUS,
    ERR,
    ANN;

    public String value() {
        return name();
    }

    public static TcodeTypeIndex fromValue(String v) {
        return valueOf(v);
    }

}
