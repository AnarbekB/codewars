package ru.balmukanov.codewars.collections;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class PaginationHelperTest {

    @Test
    public void scenarioSimpleTest() {
        PaginationHelper<String> paginator = new PaginationHelperAttempt<>(
                Arrays.asList("a", "b", "c", "d", "e", "f"),
                4
        );

        assertEquals(2, paginator.pageCount());
        assertEquals(6, paginator.itemCount());
        assertEquals(-1, paginator.pageItemCount(2));
        assertEquals(4, paginator.pageItemCount(0));
        assertEquals(2, paginator.pageItemCount(1));

        assertEquals(1, paginator.pageIndex(5));
        assertEquals(0, paginator.pageIndex(2));
        assertEquals(-1, paginator.pageIndex(20));
        assertEquals(-1, paginator.pageIndex(-10));
    }

    @Test
    public void scenarioCharTest() {
        PaginationHelper<Character> paginator = new PaginationHelperAttempt<>(
                Arrays.asList('a', 'b', 'c', 'd', 'e', 'g', 'j', 'k', 'l'),
                4
        );

        assertEquals(3, paginator.pageCount());
        assertEquals(9, paginator.itemCount());
        assertEquals(-1, paginator.pageItemCount(4));
        assertEquals(4, paginator.pageItemCount(1));
        assertEquals(1, paginator.pageItemCount(2));

        assertEquals(1, paginator.pageIndex(5));
        assertEquals(0, paginator.pageIndex(2));
        assertEquals(2, paginator.pageIndex(8));
        assertEquals(-1, paginator.pageIndex(20));
        assertEquals(-1, paginator.pageIndex(-10));
    }

}
