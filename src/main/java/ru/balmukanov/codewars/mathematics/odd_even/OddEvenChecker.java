package ru.balmukanov.codewars.mathematics.odd_even;

import java.util.Arrays;

/**
 * Given a list of integers, determine whether the sum of its elements is odd or even.
 * Give your answer as a string matching "odd" or "even".
 * If the input array is empty consider it as: [0] (array with a zero).
 *
 * Examples:
 * Input: [0]
 * Output: "even"
 *
 * Input: [0, 1, 4]
 * Output: "odd"
 *
 * Input: [0, -1, -5]
 * Output: "even"
 *
 * https://www.codewars.com/kata/5949481f86420f59480000e7
 */
public class OddEvenChecker {
    public String oddOrEven(int[] array) {
        return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}