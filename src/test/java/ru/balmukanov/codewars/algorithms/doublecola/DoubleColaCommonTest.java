package ru.balmukanov.codewars.algorithms.doublecola;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DoubleColaCommonTest {
    private final List<DoubleCola> implementsList = new ArrayList<>() {
        {
            add(new DoubleColaCommon());
        }
    };

    @Test
    public void testSimpleScenario() {
        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
        for (DoubleCola doubleCola: implementsList) {
            assertEquals(
                    "Leonard",
                    doubleCola.whoIsNext(names, 2)
            );
        }
    }

    @Test
    public void testSimpleScenario2() {
        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
        for (DoubleCola doubleCola: implementsList) {
            assertEquals(
                    "Penny",
                    doubleCola.whoIsNext(names, 3)
            );
        }
    }

    @Test
    public void testSimpleScenario3() {
        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
        for (DoubleCola doubleCola: implementsList) {
            assertEquals(
                    "Leonard",
                    doubleCola.whoIsNext(names, 8)
            );
        }
    }

    @Test
    public void testSimpleScenario4() {
        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
        for (DoubleCola doubleCola: implementsList) {
            assertEquals(
                    "Penny",
                    doubleCola.whoIsNext(names, 52)
            );
        }
    }
}