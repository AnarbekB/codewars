package ru.balmukanov.codewars.string.searchduplicates;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SearchDuplicatesStreamTest {

    @Test
    public void basicTests(){
        assertArrayEquals(
                new String[]{"codewars","picaniny","hubububo"},
                SearchDuplicatesStream.dup(new String[]{"ccooddddddewwwaaaaarrrrsssss","piccaninny","hubbubbubboo"})
        );
        assertArrayEquals(
                new String[]{"abracadabra","alote","asese"},
                SearchDuplicatesStream.dup(new String[]{"abracadabra","allottee","assessee"})
        );
        assertArrayEquals(
                new String[]{"keles","kenes"},
                SearchDuplicatesStream.dup(new String[]{"kelless","keenness"})
        );
    }
}
