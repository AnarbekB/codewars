package ru.balmukanov.codewars.string.tocamelcase;

import org.junit.Test;
import ru.balmukanov.codewars.string.tocamelcase.StringToCamelCase;

import static org.junit.Assert.assertEquals;

public class StringToCamelCaseTest {

    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        assertEquals("theStealthWarrior", StringToCamelCase.toCamelCase(input));
    }

    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        assertEquals("theStealthWarrior", StringToCamelCase.toCamelCase(input));
    }

    @Test
    public void testSomeFirstUpperChar() {
        String input = "The-Stealth-Warrior";
        assertEquals("TheStealthWarrior", StringToCamelCase.toCamelCase(input));
    }
}
