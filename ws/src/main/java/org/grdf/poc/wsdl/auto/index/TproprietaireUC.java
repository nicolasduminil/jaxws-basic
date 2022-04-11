
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TproprietaireUC.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TproprietaireUC"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GrDF"/&gt;
 *     &lt;enumeration value="Autre"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TproprietaireUC", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TproprietaireUC {

    @XmlEnumValue("GrDF")
    GR_DF("GrDF"),
    @XmlEnumValue("Autre")
    AUTRE("Autre");
    private final String value;

    TproprietaireUC(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TproprietaireUC fromValue(String v) {
        for (TproprietaireUC c: TproprietaireUC.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
