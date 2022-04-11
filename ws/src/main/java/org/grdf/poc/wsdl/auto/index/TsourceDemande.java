
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TsourceDemande.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TsourceDemande"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MADD"/&gt;
 *     &lt;enumeration value="PRES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TsourceDemande", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TsourceDemande {

    MADD,
    PRES;

    public String value() {
        return name();
    }

    public static TsourceDemande fromValue(String v) {
        return valueOf(v);
    }

}
