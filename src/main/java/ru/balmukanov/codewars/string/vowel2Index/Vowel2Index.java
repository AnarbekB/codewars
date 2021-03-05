package ru.balmukanov.codewars.string.vowel2Index;

/**
 * Write a function
 *
 * vowel2Index(String s)
 * that takes in a string and replaces all the vowels [a,e,i,o,u] with their respective positions within that string.
 * E.g:
 *
 * Kata.Vowel2Index("this is my string") == "th3s 6s my str15ng"
 * Kata.Vowel2Index("Codewars is the best site in the world") == "C2d4w6rs 10s th15 b18st s23t25 27n th32 w35rld"
 * Your function should be case insensitive to the vowels.
 *
 * https://www.codewars.com/kata/55d410c492e6ed767000004f
 */
public class Vowel2Index {
    public String convert(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ("aeiou".indexOf(s.charAt(i)) < 0) {
                stringBuilder.append(s.charAt(i));
                continue;
            }

            stringBuilder.append(i + 1);
        }

        return stringBuilder.toString();
    }
}