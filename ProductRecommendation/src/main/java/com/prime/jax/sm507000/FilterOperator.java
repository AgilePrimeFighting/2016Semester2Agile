
package com.prime.jax.sm507000;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FilterOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="And"/>
 *     &lt;enumeration value="Or"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FilterOperator")
@XmlEnum
public enum FilterOperator {

    @XmlEnumValue("And")
    AND("And"),
    @XmlEnumValue("Or")
    OR("Or");
    private final String value;

    FilterOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FilterOperator fromValue(String v) {
        for (FilterOperator c: FilterOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
