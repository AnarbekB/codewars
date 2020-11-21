package ru.balmukanov.codewars.string.searchduplicates;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SearchDuplicatesTest {

    @Test
    public void basicTests(){
        assertArrayEquals(
                new String[]{"codewars","picaniny","hubububo"},
                SearchDuplicates.dup(new String[]{"ccooddddddewwwaaaaarrrrsssss","piccaninny","hubbubbubboo"})
        );
        assertArrayEquals(
                new String[]{"abracadabra","alote","asese"},
                SearchDuplicates.dup(new String[]{"abracadabra","allottee","assessee"})
        );
        assertArrayEquals(
                new String[]{"keles","kenes"},
                SearchDuplicates.dup(new String[]{"kelless","keenness"})
        );
    }
}
