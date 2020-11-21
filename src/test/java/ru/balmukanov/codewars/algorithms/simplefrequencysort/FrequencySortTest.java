package ru.balmukanov.codewars.algorithms.simplefrequencysort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FrequencySortTest {

    @Test
    public void test3EasyElements() {
        assertArrayEquals(
                new int[] {2, 2, 1},
                FrequencySort.sortByFrequency(new int[] {2, 1, 2})
        );
    }

    @Test
    public void testWithLessElements() {
        assertArrayEquals(
                new int[]{5, 5, 5, 1, 1, 2, 2, 3, 3},
                FrequencySort.sortByFrequency(new int[]{2, 3, 5, 1, 2, 5, 3, 5, 1})
        );
    }

    @Test
    public void kataTest() {
        assertArrayEquals(
                new int[]{3, 3, 3, 5, 5, 7, 7, 2, 9},
                FrequencySort.sortByFrequency(new int[]{2, 3, 5, 3, 7, 9, 5, 3, 7})
        );
        assertArrayEquals(
                new int[]{1, 1, 1, 0, 0, 6, 6, 8, 8, 2, 3, 5, 9},
                FrequencySort.sortByFrequency(new int[]{1, 2, 3, 0, 5, 0, 1, 6, 8, 8, 6, 9, 1})
        );
        assertArrayEquals(
                new int[]{9, 9, 9, 9, 4, 4, 5, 5, 6, 6},
                FrequencySort.sortByFrequency(new int[]{5, 9, 6, 9, 6, 5, 9, 9, 4, 4})
        );
        assertArrayEquals(
                new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 8},
                FrequencySort.sortByFrequency(new int[]{4, 4, 2, 5, 1, 1, 3, 3, 2, 8})
        );
        assertArrayEquals(
                new int[]{0, 0, 4, 4, 9, 9, 3, 5, 7, 8},
                FrequencySort.sortByFrequency(new int[]{4, 9, 5, 0, 7, 3, 8, 4, 9, 0})
        );
    }
}
