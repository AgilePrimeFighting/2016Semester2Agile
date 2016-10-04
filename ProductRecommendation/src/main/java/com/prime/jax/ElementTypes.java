
package com.prime.jax;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElementTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ElementTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="String"/>
 *     &lt;enumeration value="AsciiString"/>
 *     &lt;enumeration value="StringSelector"/>
 *     &lt;enumeration value="ExplicitSelector"/>
 *     &lt;enumeration value="Number"/>
 *     &lt;enumeration value="Option"/>
 *     &lt;enumeration value="WideOption"/>
 *     &lt;enumeration value="Calendar"/>
 *     &lt;enumeration value="Action"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ElementTypes")
@XmlEnum
public enum ElementTypes {

    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("AsciiString")
    ASCII_STRING("AsciiString"),
    @XmlEnumValue("StringSelector")
    STRING_SELECTOR("StringSelector"),
    @XmlEnumValue("ExplicitSelector")
    EXPLICIT_SELECTOR("ExplicitSelector"),
    @XmlEnumValue("Number")
    NUMBER("Number"),
    @XmlEnumValue("Option")
    OPTION("Option"),
    @XmlEnumValue("WideOption")
    WIDE_OPTION("WideOption"),
    @XmlEnumValue("Calendar")
    CALENDAR("Calendar"),
    @XmlEnumValue("Action")
    ACTION("Action");
    private final String value;

    ElementTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElementTypes fromValue(String v) {
        for (ElementTypes c: ElementTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
