
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeSituationCompteur.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeSituationCompteur"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeSituationCompteur", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeSituationCompteur {

    L,
    C,
    S,
    G,
    E,
    A;

    public String value() {
        return name();
    }

    public static TcodeSituationCompteur fromValue(String v) {
        return valueOf(v);
    }

}
