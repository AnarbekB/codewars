package ru.balmukanov.codewars.string.long_repetition;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * For a given string s find the character c (or C) with longest consecutive
 * repetition and return:
 * Object[]{c, l};
 *
 * where l (or L) is the length of the repetition. If there are two or more
 * characters with the same l return the first in order of appearance.
 *
 * For empty string return:
 * Object[]{"", 0}
 */
public class CharacterWithLongestConsecutiveRepetition {

    public static Object[] longestRepetition(String s) {
        if (s == null || s.length() == 0) {
            return new Object[]{"", 0};
        }

        Pattern p = Pattern.compile("(\\w)\\1+");
        Matcher m = p.matcher(s);

        String find = "";
        while (m.find()) {
            String current = m.group(0);
            if (current.length() > find.length()) {
                find = current;
            }
        }

        return new Object[]{String.valueOf(find.charAt(0)), find.length()};
    }
}
