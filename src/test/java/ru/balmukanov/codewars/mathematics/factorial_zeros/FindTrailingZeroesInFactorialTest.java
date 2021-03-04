package ru.balmukanov.codewars.mathematics.factorial_zeros;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindTrailingZeroesInFactorialTest {
    private final FindTrailingZeroesInFactorial finder;

    public FindTrailingZeroesInFactorialTest() {
        this.finder = new FindTrailingZeroesInFactorial();
    }

    @Test
    public void zerosScenario1() {
        assertEquals(1, this.finder.zeros(5));
    }

    @Test
    public void zerosScenario2() {
        assertEquals(2, this.finder.zeros(14));
    }

    @Test
    public void zerosScenario3() {
        assertEquals(4, this.finder.zeros(20));
    }
}