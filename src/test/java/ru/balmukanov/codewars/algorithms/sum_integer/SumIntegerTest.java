package ru.balmukanov.codewars.algorithms.sum_integer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SumIntegerTest {

    private final List<SumInteger> implementsList = new ArrayList<>() {
        {
            add(new SumIntegerAttempt());
        }
    };

    @Test
    public void xIsZeroTest() {
        int x = 0;
        int y = 4;

        for (SumInteger summer : implementsList) {
            assertEquals(4, summer.add(x, y));
        }
    }

    @Test
    public void yIsZeroTest() {
        int x = 5;
        int y = 0;

        for (SumInteger summer : implementsList) {
            assertEquals(5, summer.add(x, y));
        }
    }

    @Test
    public void addTwoEvenNumberTest() {
        int x = 2;
        int y = 2;

        for (SumInteger summer : implementsList) {
            assertEquals(4, summer.add(x, y));
        }
    }

    @Test
    public void addTwoOddNumberTest() {
        int x = 3;
        int y = 3;

        for (SumInteger summer : implementsList) {
            assertEquals(6, summer.add(x, y));
        }
    }

    @Test
    public void addVariousNumberTest() {
        int x = 5;
        int y = 2;

        for (SumInteger summer : implementsList) {
            assertEquals(7, summer.add(x, y));
        }
    }

    @Test
    public void xIsMinusAddTest() {
        int x = -2;
        int y = 5;

        for (SumInteger summer : implementsList) {
            assertEquals(3, summer.add(x, y));
        }
    }
}
