
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeTypeImputation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeTypeImputation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EOTP"/&gt;
 *     &lt;enumeration value="CCA"/&gt;
 *     &lt;enumeration value="ORDRE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeTypeImputation", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeTypeImputation {

    EOTP,
    CCA,
    ORDRE;

    public String value() {
        return name();
    }

    public static TcodeTypeImputation fromValue(String v) {
        return valueOf(v);
    }

}
