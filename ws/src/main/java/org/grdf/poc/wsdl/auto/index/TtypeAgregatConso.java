
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TtypeAgregatConso.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TtypeAgregatConso"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Annuel"/&gt;
 *     &lt;enumeration value="Mensuel"/&gt;
 *     &lt;enumeration value="Hebdomadaire"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TtypeAgregatConso", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TtypeAgregatConso {

    @XmlEnumValue("Annuel")
    ANNUEL("Annuel"),
    @XmlEnumValue("Mensuel")
    MENSUEL("Mensuel"),
    @XmlEnumValue("Hebdomadaire")
    HEBDOMADAIRE("Hebdomadaire");
    private final String value;

    TtypeAgregatConso(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TtypeAgregatConso fromValue(String v) {
        for (TtypeAgregatConso c: TtypeAgregatConso.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
