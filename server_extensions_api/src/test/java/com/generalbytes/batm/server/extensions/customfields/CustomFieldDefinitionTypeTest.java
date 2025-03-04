package com.generalbytes.batm.server.extensions.customfields;

import com.generalbytes.batm.server.extensions.customfields.value.StringCustomFieldValue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class CustomFieldDefinitionTypeTest {

    @Test
    void isValueTypeAllowed() {
        StringCustomFieldValue str = new StringCustomFieldValue("test");
        assertTrue(CustomFieldDefinitionType.PARAGRAPH.isValueTypeAllowed(str.getClass()));
        assertTrue(CustomFieldDefinitionType.SINGLE_LINE.isValueTypeAllowed(str.getClass()));
        assertFalse(CustomFieldDefinitionType.DROPDOWN.isValueTypeAllowed(str.getClass()));
        assertFalse(CustomFieldDefinitionType.RADIO_BTN.isValueTypeAllowed(str.getClass()));
        assertFalse(CustomFieldDefinitionType.CHECKBOX.isValueTypeAllowed(str.getClass()));
        assertFalse(CustomFieldDefinitionType.IMAGE.isValueTypeAllowed(str.getClass()));
        assertFalse(CustomFieldDefinitionType.DOCUMENT.isValueTypeAllowed(str.getClass()));
        assertFalse(CustomFieldDefinitionType.DATE.isValueTypeAllowed(str.getClass()));
    }
}