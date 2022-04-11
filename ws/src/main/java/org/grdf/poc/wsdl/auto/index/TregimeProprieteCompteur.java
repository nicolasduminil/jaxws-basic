
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TregimeProprieteCompteur.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TregimeProprieteCompteur"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="J"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TregimeProprieteCompteur", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TregimeProprieteCompteur {

    L,
    P,
    H,
    J;

    public String value() {
        return name();
    }

    public static TregimeProprieteCompteur fromValue(String v) {
        return valueOf(v);
    }

}
