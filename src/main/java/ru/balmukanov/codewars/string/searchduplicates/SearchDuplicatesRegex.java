package ru.balmukanov.codewars.string.searchduplicates;

public class SearchDuplicatesRegex {

    public static String[] dup(String[] arr){
        for(int i = 0; i < arr.length; i++)
            arr[i] = arr[i].replaceAll("(.)\\1+", "$1");
        return arr;
    }
}
