package ru.balmukanov.codewars.string.tocamelcase;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringToCamelCaseStreamTest {

    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        assertEquals("theStealthWarrior", StringToCamelCaseStream.toCamelCase(input));
    }

    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        assertEquals("theStealthWarrior", StringToCamelCaseStream.toCamelCase(input));
    }

    @Test
    public void testSomeFirstUpperChar() {
        String input = "The-Stealth-Warrior";
        assertEquals("TheStealthWarrior", StringToCamelCaseStream.toCamelCase(input));
    }
}
