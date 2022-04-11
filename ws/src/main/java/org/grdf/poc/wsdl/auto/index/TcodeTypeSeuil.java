
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TcodeTypeSeuil.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TcodeTypeSeuil"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Annuel"/&gt;
 *     &lt;enumeration value="Janvier"/&gt;
 *     &lt;enumeration value="Fevrier"/&gt;
 *     &lt;enumeration value="Mars"/&gt;
 *     &lt;enumeration value="Avril"/&gt;
 *     &lt;enumeration value="Mai"/&gt;
 *     &lt;enumeration value="Juin"/&gt;
 *     &lt;enumeration value="Juillet"/&gt;
 *     &lt;enumeration value="Aout"/&gt;
 *     &lt;enumeration value="Septembre"/&gt;
 *     &lt;enumeration value="Octobre"/&gt;
 *     &lt;enumeration value="Novembre"/&gt;
 *     &lt;enumeration value="Decembre"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TcodeTypeSeuil", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TcodeTypeSeuil {

    @XmlEnumValue("Annuel")
    ANNUEL("Annuel"),
    @XmlEnumValue("Janvier")
    JANVIER("Janvier"),
    @XmlEnumValue("Fevrier")
    FEVRIER("Fevrier"),
    @XmlEnumValue("Mars")
    MARS("Mars"),
    @XmlEnumValue("Avril")
    AVRIL("Avril"),
    @XmlEnumValue("Mai")
    MAI("Mai"),
    @XmlEnumValue("Juin")
    JUIN("Juin"),
    @XmlEnumValue("Juillet")
    JUILLET("Juillet"),
    @XmlEnumValue("Aout")
    AOUT("Aout"),
    @XmlEnumValue("Septembre")
    SEPTEMBRE("Septembre"),
    @XmlEnumValue("Octobre")
    OCTOBRE("Octobre"),
    @XmlEnumValue("Novembre")
    NOVEMBRE("Novembre"),
    @XmlEnumValue("Decembre")
    DECEMBRE("Decembre");
    private final String value;

    TcodeTypeSeuil(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TcodeTypeSeuil fromValue(String v) {
        for (TcodeTypeSeuil c: TcodeTypeSeuil.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
