package ru.balmukanov.codewars.algorithms.simplefrequencysort;

import java.util.*;

/**
 * In this Kata, you will sort elements in an array by decreasing
 * frequency of elements. If two elements have the same frequency,
 * sort them by increasing value.
 * <p>
 * Solution.sortByFrequency(new int[]{2, 3, 5, 3, 7, 9, 5, 3, 7});
 * Returns {3, 3, 3, 5, 5, 7, 7, 2, 9}
 * We sort by highest frequency to lowest frequency.
 * If two elements have same frequency, we sort by increasing value.
 * <p>
 * https://www.codewars.com/kata/5a8d2bf60025e9163c0000bc/train/java
 */
public class FrequencySort {

    public static int[] sortByFrequency(int[] array) {
        Map<Integer, Integer> elements = new LinkedHashMap<>();
        List<Integer> sorted = new ArrayList<>();
        Arrays.stream(array).forEach(value -> {
            if (elements.containsKey(value)) {
                elements.put(value, elements.get(value) + 1);
            } else {
                elements.put(value, 1);
            }
        });

        elements
                .entrySet()
                .stream()
                .sorted((o1, o2) -> {
                    int val = o1.getValue().compareTo(o2.getValue());
                    if (val < 0) return 1;
                    if (val > 0) return -1;

                    int key = o1.getKey().compareTo(o2.getKey());
                    return key < 0 ? -1 : 1;
                })
                .forEach(entry -> {
                    for (int i = 1; i <= entry.getValue(); i++) {
                        sorted.add(entry.getKey());
                    }
                });
        return sorted.stream().mapToInt(value -> value).toArray();
    }
}