
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TmotifStatutDI.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TmotifStatutDI"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="enCoursEnvoi"/&gt;
 *     &lt;enumeration value="echecEnvoi"/&gt;
 *     &lt;enumeration value="succesEnvoi"/&gt;
 *     &lt;enumeration value="echecTeleconfiguration"/&gt;
 *     &lt;enumeration value="succesTeleconfiguration"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TmotifStatutDI", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TmotifStatutDI {

    @XmlEnumValue("enCoursEnvoi")
    EN_COURS_ENVOI("enCoursEnvoi"),
    @XmlEnumValue("echecEnvoi")
    ECHEC_ENVOI("echecEnvoi"),
    @XmlEnumValue("succesEnvoi")
    SUCCES_ENVOI("succesEnvoi"),
    @XmlEnumValue("echecTeleconfiguration")
    ECHEC_TELECONFIGURATION("echecTeleconfiguration"),
    @XmlEnumValue("succesTeleconfiguration")
    SUCCES_TELECONFIGURATION("succesTeleconfiguration");
    private final String value;

    TmotifStatutDI(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TmotifStatutDI fromValue(String v) {
        for (TmotifStatutDI c: TmotifStatutDI.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
