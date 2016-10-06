
package com.prime.jax;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="INVALID_CREDENTIALS"/>
 *     &lt;enumeration value="INTERNAL_ERROR"/>
 *     &lt;enumeration value="INVALID_API_VERSION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorCode")
@XmlEnum
public enum ErrorCode {

    OK,
    INVALID_CREDENTIALS,
    INTERNAL_ERROR,
    INVALID_API_VERSION;

    public String value() {
        return name();
    }

    public static ErrorCode fromValue(String v) {
        return valueOf(v);
    }

}
