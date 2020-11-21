package ru.balmukanov.codewars.string.deadfish;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DeadFishBestPracticesTest {

    @Test
    public void testDeadFishInvalidCommands() {
        assertArrayEquals(new int[] {}, DeadFishBestPractices.parse("566zcvvccx"));
    }

    @Test
    public void testDeadFishIncrementOnly() {
        assertArrayEquals(new int[] {}, DeadFishBestPractices.parse("i"));
    }

    @Test
    public void testDeadFishIncrementAndOut() {
        assertArrayEquals(new int[] {1}, DeadFishBestPractices.parse("io"));
    }

    @Test
    public void testDeadFishOutAndIncrement() {
        assertArrayEquals(new int[] {0}, DeadFishBestPractices.parse("oi"));
    }

    @Test
    public void testDeadFishMultiple() {
        assertArrayEquals(new int[] {8, 64}, DeadFishBestPractices.parse("iiisdoso"));
        assertArrayEquals(new int[] {8, 64, 3600}, DeadFishBestPractices.parse("iiisdosodddddiso"));
    }
}
