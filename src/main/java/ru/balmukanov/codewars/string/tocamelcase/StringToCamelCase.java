package ru.balmukanov.codewars.string.tocamelcase;

/**
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing.
 * The first word within the output should be capitalized only if the original word was
 * capitalized (known as Upper Camel Case, also often referred to as Pascal case).
 */
public class StringToCamelCase {

    public static String toCamelCase(String s)
    {
        String[] words = s.split("[-|_]");

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i > 0) {
                word = word.substring(0, 1).toUpperCase() + word.substring(1);
            }
            builder.append(word);
        }

        return builder.toString();
    }
}
