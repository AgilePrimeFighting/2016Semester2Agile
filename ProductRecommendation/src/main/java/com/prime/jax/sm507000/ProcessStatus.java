
package com.prime.jax.sm507000;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotExists"/>
 *     &lt;enumeration value="InProcess"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Aborted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcessStatus")
@XmlEnum
public enum ProcessStatus {

    @XmlEnumValue("NotExists")
    NOT_EXISTS("NotExists"),
    @XmlEnumValue("InProcess")
    IN_PROCESS("InProcess"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Aborted")
    ABORTED("Aborted");
    private final String value;

    ProcessStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProcessStatus fromValue(String v) {
        for (ProcessStatus c: ProcessStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
