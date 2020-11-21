package ru.balmukanov.codewars.string.searchduplicates;

import java.util.Arrays;

public class SearchDuplicatesStream {

    public static String[] dup(String[] arr){
        return Arrays.stream(arr).map(x->x.replaceAll("(.)(?=\\1)","")).toArray(String[]::new);
    }
}
