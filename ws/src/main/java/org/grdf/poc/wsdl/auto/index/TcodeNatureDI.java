
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeNatureDI.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeNatureDI"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="nouvellePrestation"/&gt;
 *     &lt;enumeration value="annulation"/&gt;
 *     &lt;enumeration value="abandon"/&gt;
 *     &lt;enumeration value="expirationAnticipee"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeNatureDI", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeNatureDI {

    @XmlEnumValue("nouvellePrestation")
    NOUVELLE_PRESTATION("nouvellePrestation"),
    @XmlEnumValue("annulation")
    ANNULATION("annulation"),
    @XmlEnumValue("abandon")
    ABANDON("abandon"),
    @XmlEnumValue("expirationAnticipee")
    EXPIRATION_ANTICIPEE("expirationAnticipee");
    private final String value;

    TcodeNatureDI(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeNatureDI fromValue(String v) {
        for (TcodeNatureDI c: TcodeNatureDI.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
