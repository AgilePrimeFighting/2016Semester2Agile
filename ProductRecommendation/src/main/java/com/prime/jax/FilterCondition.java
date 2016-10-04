
package com.prime.jax;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterCondition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FilterCondition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Equals"/>
 *     &lt;enumeration value="NotEqual"/>
 *     &lt;enumeration value="Greater"/>
 *     &lt;enumeration value="GreaterOrEqual"/>
 *     &lt;enumeration value="Less"/>
 *     &lt;enumeration value="LessOrEqual"/>
 *     &lt;enumeration value="Contain"/>
 *     &lt;enumeration value="StartsWith"/>
 *     &lt;enumeration value="EndsWith"/>
 *     &lt;enumeration value="NotContain"/>
 *     &lt;enumeration value="Between"/>
 *     &lt;enumeration value="IsNull"/>
 *     &lt;enumeration value="IsNotNull"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FilterCondition")
@XmlEnum
public enum FilterCondition {

    @XmlEnumValue("Equals")
    EQUALS("Equals"),
    @XmlEnumValue("NotEqual")
    NOT_EQUAL("NotEqual"),
    @XmlEnumValue("Greater")
    GREATER("Greater"),
    @XmlEnumValue("GreaterOrEqual")
    GREATER_OR_EQUAL("GreaterOrEqual"),
    @XmlEnumValue("Less")
    LESS("Less"),
    @XmlEnumValue("LessOrEqual")
    LESS_OR_EQUAL("LessOrEqual"),
    @XmlEnumValue("Contain")
    CONTAIN("Contain"),
    @XmlEnumValue("StartsWith")
    STARTS_WITH("StartsWith"),
    @XmlEnumValue("EndsWith")
    ENDS_WITH("EndsWith"),
    @XmlEnumValue("NotContain")
    NOT_CONTAIN("NotContain"),
    @XmlEnumValue("Between")
    BETWEEN("Between"),
    @XmlEnumValue("IsNull")
    IS_NULL("IsNull"),
    @XmlEnumValue("IsNotNull")
    IS_NOT_NULL("IsNotNull");
    private final String value;

    FilterCondition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FilterCondition fromValue(String v) {
        for (FilterCondition c: FilterCondition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
