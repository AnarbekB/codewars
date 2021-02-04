package ru.balmukanov.codewars.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class ExtractArrayDifferenceTwoTest {

    private final List<ExtractArray> implementsList = new ArrayList<>() {
        {
            add(new ExtractArrayDifferenceTwo());
            add(new ExtractArrayDifferenceTwoStream());
        }
    };

    @Test
    public void testSimpleScenario1() {
        for (ExtractArray extractor : implementsList) {
            assertArrayEquals(
                    new int[][]{{1, 3}, {2, 4}},
                    extractor.twosDifference(new int[]{1, 2, 3, 4})
            );
        }
    }

    @Test
    public void testSimpleScenario2() {
        for (ExtractArray extractor : implementsList) {
            assertArrayEquals(
                    new int[][]{{1, 3}, {2, 4}},
                    extractor.twosDifference(new int[]{4, 1, 2, 3})
            );
        }
    }

    @Test
    public void testSimpleScenario3() {
        for (ExtractArray extractor : implementsList) {
            assertArrayEquals(
                    new int[][]{{1, 3}},
                    extractor.twosDifference(new int[]{1, 23, 3, 4, 7})
            );
        }
    }

    @Test
    public void testSimpleScenario4() {
        for (ExtractArray extractor : implementsList) {
            assertArrayEquals(
                    new int[][]{{1, 3}, {3, 5}, {4, 6}},
                    extractor.twosDifference(new int[]{4, 3, 1, 5, 6})
            );
        }
    }

    @Test
    public void testSimpleScenario5() {
        for (ExtractArray extractor : implementsList) {
            assertArrayEquals(
                    new int[][]{{1, 3}, {2, 4}, {3, 5}, {4, 6}, {5, 7}, {6, 8}, {7, 9}},
                    extractor.twosDifference(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})
            );
        }
    }

    @Test
    public void testScenario6() {
        for (ExtractArray extractor : implementsList) {
            assertArrayEquals(
                    new int[][]{{1, 3}, {2, 4}, {3, 5}, {4, 6}, {5, 7}, {6, 8}, {7, 9}},
                    extractor.twosDifference(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1})
            );
        }
    }
}
