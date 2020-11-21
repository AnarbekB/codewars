package ru.balmukanov.codewars.string.deadfish;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DeadFishTest {

    @Test
    public void testDeadFishInvalidCommands() {
        assertArrayEquals(new int[] {}, DeadFish.parse("566zcvvccx"));
    }

    @Test
    public void testDeadFishIncrementOnly() {
        assertArrayEquals(new int[] {}, DeadFish.parse("i"));
    }

    @Test
    public void testDeadFishIncrementAndOut() {
        assertArrayEquals(new int[] {1}, DeadFish.parse("io"));
    }

    @Test
    public void testDeadFishOutAndIncrement() {
        assertArrayEquals(new int[] {0}, DeadFish.parse("oi"));
    }

    @Test
    public void testDeadFishMultiple() {
        assertArrayEquals(new int[] {8, 64}, DeadFish.parse("iiisdoso"));
        assertArrayEquals(new int[] {8, 64, 3600}, DeadFish.parse("iiisdosodddddiso"));
    }
}
