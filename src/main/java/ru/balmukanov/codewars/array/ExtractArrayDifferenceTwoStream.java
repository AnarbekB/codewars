package ru.balmukanov.codewars.array;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/reviews/5e945de7d867810001f21494/groups/5e945de8d867810001f21498
 */
public class ExtractArrayDifferenceTwoStream implements ExtractArray {
    public int[][] twosDifference(int[] a) {
        var s = Arrays.stream(a).boxed().collect(Collectors.toSet());
        return Arrays.stream(a).boxed().filter(x -> s.contains(x + 2)).sorted().map(x -> new int[]{x, x + 2}).toArray(int[][]::new);
    }
}
