
package org.grdf.poc.wsdl.auto.index;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TtypeCommandeLogistique.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TtypeCommandeLogistique"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DMR"/&gt;
 *     &lt;enumeration value="DRM"/&gt;
 *     &lt;enumeration value="DRG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TtypeCommandeLogistique", namespace = "com.grdf.poc.type.v1.38")
@XmlEnum
public enum TtypeCommandeLogistique {

    DMR,
    DRM,
    DRG;

    public String value() {
        return name();
    }

    public static TtypeCommandeLogistique fromValue(String v) {
        return valueOf(v);
    }

}
