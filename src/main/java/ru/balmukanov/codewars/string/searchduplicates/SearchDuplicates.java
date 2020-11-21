package ru.balmukanov.codewars.string.searchduplicates;

import java.util.ArrayList;

/**
 * In this Kata, you will be given an array of strings and yourtask is to
 * remove all consecutive duplicate letters from each string in the array.
 *
 * For example:
 *
 * dup(["abracadabra","allottee","assessee"]) = ["abracadabra","alote","asese"].
 *
 * dup(["kelless","keenness"]) = ["keles","kenes"].
 *
 * Strings will be lowercase only, no spaces. See test cases for more examples.
 */
public class SearchDuplicates {

    public static String[] dup(String[] arr) {
        ArrayList<String> result = new ArrayList<>();

        for (String s : arr) {
            StringBuilder string = new StringBuilder();
            char lastChar = 0;
            for (int j = 0; j < s.length(); j++) {
                if (j == 0) {
                    string.append(s.charAt(j));
                    lastChar = s.charAt(j);
                }
                if (s.charAt(j) != lastChar) {
                    string.append(s.charAt(j));
                    lastChar = s.charAt(j);
                }
            }

            result.add(string.toString());
        }

        return result.toArray(String[]::new);
    }
}
