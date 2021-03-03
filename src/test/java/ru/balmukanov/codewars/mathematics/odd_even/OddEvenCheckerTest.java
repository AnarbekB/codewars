package ru.balmukanov.codewars.mathematics.odd_even;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenCheckerTest {

    private final OddEvenChecker oddEvenChecker;

    public OddEvenCheckerTest() {
        this.oddEvenChecker = new OddEvenChecker();
    }

    @Test
    public void oddOrEvenScenario() {
        assertEquals("even", this.oddEvenChecker.oddOrEven(new int[] {0}));
    }

    @Test
    public void oddOrEvenScenario2() {
        assertEquals("odd", this.oddEvenChecker.oddOrEven(new int[] {0, 1, 4}));
    }

    @Test
    public void oddOrEvenScenario3() {
        assertEquals("even", this.oddEvenChecker.oddOrEven(new int[] {0, -1, -5}));
    }
}