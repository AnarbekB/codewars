package ru.balmukanov.codewars.string.searchduplicates;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SearchDuplicatesRegexTest {

    @Test
    public void basicTests(){
        assertArrayEquals(
                new String[]{"codewars","picaniny","hubububo"},
                SearchDuplicatesRegex.dup(new String[]{"ccooddddddewwwaaaaarrrrsssss","piccaninny","hubbubbubboo"})
        );
        assertArrayEquals(
                new String[]{"abracadabra","alote","asese"},
                SearchDuplicatesRegex.dup(new String[]{"abracadabra","allottee","assessee"})
        );
        assertArrayEquals(
                new String[]{"keles","kenes"},
                SearchDuplicatesRegex.dup(new String[]{"kelless","keenness"})
        );
    }
}
