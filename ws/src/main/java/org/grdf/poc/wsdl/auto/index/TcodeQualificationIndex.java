
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeQualificationIndex.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeQualificationIndex"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MES"/&gt;
 *     &lt;enumeration value="EST"/&gt;
 *     &lt;enumeration value="COR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeQualificationIndex", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeQualificationIndex {

    MES,
    EST,
    COR;

    public String value() {
        return name();
    }

    public static TcodeQualificationIndex fromValue(String v) {
        return valueOf(v);
    }

}
