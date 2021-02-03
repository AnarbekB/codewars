package ru.balmukanov.codewars.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ExtractArrayDifferenceTwoTest {

    @Test
    public void testSimpleScenario1() {
        assertArrayEquals(
                new int[][] {{1, 3}, {2, 4}},
                ExtractArrayDifferenceTwo.twosDifference(new int[] {1, 2, 3 ,4})
        );
    }

    @Test
    public void testSimpleScenario2() {
        assertArrayEquals(
                new int[][] {{1, 3}, {2, 4}},
                ExtractArrayDifferenceTwo.twosDifference(new int[] {4, 1, 2, 3})
        );
    }

    @Test
    public void testSimpleScenario3() {
        assertArrayEquals(
                new int[][] {{1, 3}},
                ExtractArrayDifferenceTwo.twosDifference(new int[] {1, 23, 3, 4, 7})
        );
    }

    @Test
    public void testSimpleScenario4() {
        assertArrayEquals(
                new int[][] {{1, 3}, {3, 5}, {4, 6}},
                ExtractArrayDifferenceTwo.twosDifference(new int[] {4, 3, 1, 5, 6})
        );
    }
}
