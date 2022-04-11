
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TmodeFonctionnementDdC.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TmodeFonctionnementDdC"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Sourd-muet"/&gt;
 *     &lt;enumeration value="Stockage"/&gt;
 *     &lt;enumeration value="Test"/&gt;
 *     &lt;enumeration value="Nominal"/&gt;
 *     &lt;enumeration value="Degrade"/&gt;
 *     &lt;enumeration value="Stop"/&gt;
 *     &lt;enumeration value="Fin_de_vie"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TmodeFonctionnementDdC", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TmodeFonctionnementDdC {

    @XmlEnumValue("Sourd-muet")
    SOURD_MUET("Sourd-muet"),
    @XmlEnumValue("Stockage")
    STOCKAGE("Stockage"),
    @XmlEnumValue("Test")
    TEST("Test"),
    @XmlEnumValue("Nominal")
    NOMINAL("Nominal"),
    @XmlEnumValue("Degrade")
    DEGRADE("Degrade"),
    @XmlEnumValue("Stop")
    STOP("Stop"),
    @XmlEnumValue("Fin_de_vie")
    FIN_DE_VIE("Fin_de_vie");
    private final String value;

    TmodeFonctionnementDdC(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TmodeFonctionnementDdC fromValue(String v) {
        for (TmodeFonctionnementDdC c: TmodeFonctionnementDdC.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
