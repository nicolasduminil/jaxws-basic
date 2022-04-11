
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TstatutSI.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TstatutSI"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EPOD"/&gt;
 *     &lt;enumeration value="DISCO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TstatutSI", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TstatutSI {

    EPOD,
    DISCO;

    public String value() {
        return name();
    }

    public static TstatutSI fromValue(String v) {
        return valueOf(v);
    }

}
