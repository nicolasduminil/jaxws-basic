
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TstatutPoste.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TstatutPoste"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="supprime"/&gt;
 *     &lt;enumeration value="bloque"/&gt;
 *     &lt;enumeration value="actif"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TstatutPoste", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TstatutPoste {

    @XmlEnumValue("supprime")
    SUPPRIME("supprime"),
    @XmlEnumValue("bloque")
    BLOQUE("bloque"),
    @XmlEnumValue("actif")
    ACTIF("actif");
    private final String value;

    TstatutPoste(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TstatutPoste fromValue(String v) {
        for (TstatutPoste c: TstatutPoste.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
