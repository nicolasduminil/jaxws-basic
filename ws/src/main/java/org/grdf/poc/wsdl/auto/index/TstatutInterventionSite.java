
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TstatutInterventionSite.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TstatutInterventionSite"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="succes"/&gt;
 *     &lt;enumeration value="echec"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TstatutInterventionSite", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TstatutInterventionSite {

    @XmlEnumValue("succes")
    SUCCES("succes"),
    @XmlEnumValue("echec")
    ECHEC("echec");
    private final String value;

    TstatutInterventionSite(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TstatutInterventionSite fromValue(String v) {
        for (TstatutInterventionSite c: TstatutInterventionSite.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
