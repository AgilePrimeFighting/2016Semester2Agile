
package com.prime.jax.sm507000;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PXSpecialButtonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PXSpecialButtonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Save"/>
 *     &lt;enumeration value="SaveNotClose"/>
 *     &lt;enumeration value="Cancel"/>
 *     &lt;enumeration value="Refresh"/>
 *     &lt;enumeration value="Report"/>
 *     &lt;enumeration value="First"/>
 *     &lt;enumeration value="Next"/>
 *     &lt;enumeration value="Prev"/>
 *     &lt;enumeration value="Last"/>
 *     &lt;enumeration value="Insert"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="Approve"/>
 *     &lt;enumeration value="ApproveAll"/>
 *     &lt;enumeration value="Process"/>
 *     &lt;enumeration value="ProcessAll"/>
 *     &lt;enumeration value="EditDetail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PXSpecialButtonType")
@XmlEnum
public enum PXSpecialButtonType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Save")
    SAVE("Save"),
    @XmlEnumValue("SaveNotClose")
    SAVE_NOT_CLOSE("SaveNotClose"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("Refresh")
    REFRESH("Refresh"),
    @XmlEnumValue("Report")
    REPORT("Report"),
    @XmlEnumValue("First")
    FIRST("First"),
    @XmlEnumValue("Next")
    NEXT("Next"),
    @XmlEnumValue("Prev")
    PREV("Prev"),
    @XmlEnumValue("Last")
    LAST("Last"),
    @XmlEnumValue("Insert")
    INSERT("Insert"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Approve")
    APPROVE("Approve"),
    @XmlEnumValue("ApproveAll")
    APPROVE_ALL("ApproveAll"),
    @XmlEnumValue("Process")
    PROCESS("Process"),
    @XmlEnumValue("ProcessAll")
    PROCESS_ALL("ProcessAll"),
    @XmlEnumValue("EditDetail")
    EDIT_DETAIL("EditDetail");
    private final String value;

    PXSpecialButtonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PXSpecialButtonType fromValue(String v) {
        for (PXSpecialButtonType c: PXSpecialButtonType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
