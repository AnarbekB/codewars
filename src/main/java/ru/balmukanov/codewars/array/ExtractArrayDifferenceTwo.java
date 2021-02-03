package ru.balmukanov.codewars.array;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codewars.com/kata/5340298112fa30e786000688/train/java
 *
 * The objective is to return all pairs of integers from a given array of integers that have a difference of 2.
 *
 * The result array should be sorted in ascending order of values.
 * Assume there are no duplicate integers in the array.
 * The order of the integers in the input array should not matter.
 * Examples:
 * [1, 2, 3, 4]  should return [[1, 3], [2, 4]]
 * [4, 1, 2, 3]  should also return [[1, 3], [2, 4]]
 * [1, 23, 3, 4, 7] should return [[1, 3]]
 * [4, 3, 1, 5, 6] should return [[1, 3], [3, 5], [4, 6]]
 */
public class ExtractArrayDifferenceTwo {

    public static int[][] twosDifference(int[] array) {
        var list = new HashMap<Integer, Integer>();
        for (int k : array) {
            for (int i : array) {
                int max = Math.max(k, i);
                int min = Math.min(k, i);

                if (k == i) {
                    continue;
                }
                if ((max - min) % 2 == 0) {
                    list.put(min, max);
                }
            }
        }

        int[][] result = new int[list.size()][2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry: list.entrySet()) {
            result[index] = new int[] {entry.getKey(), entry.getValue()};
            index++;
        }

        return result;
    }
}