
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeEtatCapteurInductifCompteursIntegres.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeEtatCapteurInductifCompteursIntegres"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="signalNormal"/&gt;
 *     &lt;enumeration value="signalTropFaible"/&gt;
 *     &lt;enumeration value="signalFaible"/&gt;
 *     &lt;enumeration value="signalTropFort"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeEtatCapteurInductifCompteursIntegres", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeEtatCapteurInductifCompteursIntegres {

    @XmlEnumValue("signalNormal")
    SIGNAL_NORMAL("signalNormal"),
    @XmlEnumValue("signalTropFaible")
    SIGNAL_TROP_FAIBLE("signalTropFaible"),
    @XmlEnumValue("signalFaible")
    SIGNAL_FAIBLE("signalFaible"),
    @XmlEnumValue("signalTropFort")
    SIGNAL_TROP_FORT("signalTropFort");
    private final String value;

    TcodeEtatCapteurInductifCompteursIntegres(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeEtatCapteurInductifCompteursIntegres fromValue(String v) {
        for (TcodeEtatCapteurInductifCompteursIntegres c: TcodeEtatCapteurInductifCompteursIntegres.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
