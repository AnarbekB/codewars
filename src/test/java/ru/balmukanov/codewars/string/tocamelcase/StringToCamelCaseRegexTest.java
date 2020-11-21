package ru.balmukanov.codewars.string.tocamelcase;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringToCamelCaseRegexTest {

    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        assertEquals("theStealthWarrior", StringToCamelCaseRegex.toCamelCase(input));
    }

    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        assertEquals("theStealthWarrior", StringToCamelCaseRegex.toCamelCase(input));
    }

    @Test
    public void testSomeFirstUpperChar() {
        String input = "The-Stealth-Warrior";
        assertEquals("TheStealthWarrior", StringToCamelCaseRegex.toCamelCase(input));
    }
}
