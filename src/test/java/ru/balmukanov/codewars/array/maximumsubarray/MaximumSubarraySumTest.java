package ru.balmukanov.codewars.array.maximumsubarray;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MaximumSubarraySumTest {

    private final List<MaximumOfSubarraySum> implementsList = new ArrayList<>() {
        {
            add(new MaximumSubarraySumWithKadaneAlgorithm());
        }
    };

    @Test
    public void testSimpleScenarioTwoPositiveNumberArray() {
        for (MaximumOfSubarraySum maximumSumExtractor : implementsList) {
            assertEquals(
                    "Example array should have a max of 4",
                    4,
                    maximumSumExtractor.sequence(new int[]{1, 3})
            );
        }
    }

    @Test
    public void testEmptyArray() {
        for (MaximumOfSubarraySum maximumSumExtractor : implementsList) {
            assertEquals(
                    "Empty arrays should have a max of 0",
                    0,
                    maximumSumExtractor.sequence(new int[]{})
            );
        }
    }

    @Test
    public void testExampleArray() {
        for (MaximumOfSubarraySum maximumSumExtractor : implementsList) {
            assertEquals(
                    "Example array should have a max of 6",
                    6,
                    maximumSumExtractor.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})
            );
        }
    }

    @Test
    public void testBigArray() {
        for (MaximumOfSubarraySum maximumOfExtractor: implementsList) {
            assertEquals(
                    "Example array should have a max of 64",
                    64,
                    maximumOfExtractor.sequence(new int[]{-24, 6, 15 ,6, 12, 25, -25, -16, 7, -24, 28, -24, -19,25, -15
                            -11,6,-24,-2,9, 4, 9, 18,-13,26,0,-6,4,-19,4,11,15,0,-8,-16,-17,-28,7,28,-27,-22,
                            -29,17,3,-1,11,-16,-6,0,-21,-1,0})
            );
        }
    }
}