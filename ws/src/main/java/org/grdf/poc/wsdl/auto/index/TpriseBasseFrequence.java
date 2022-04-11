
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpriseBasseFrequence.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TpriseBasseFrequence"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OUI"/&gt;
 *     &lt;enumeration value="NON"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TpriseBasseFrequence", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TpriseBasseFrequence {

    OUI,
    NON;

    public String value() {
        return name();
    }

    public static TpriseBasseFrequence fromValue(String v) {
        return valueOf(v);
    }

}
