package ru.balmukanov.codewars.datetime.humantime;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanReadableTimePerfectTest {

    @Test
    public void Tests() {
        assertEquals("makeReadable(86399)", "23:59:59", HumanReadableTimePerfect.makeReadable(86399));
        assertEquals("makeReadable(0)", "00:00:00", HumanReadableTimePerfect.makeReadable(0));
        assertEquals("makeReadable(5)", "00:00:05", HumanReadableTimePerfect.makeReadable(5));
        assertEquals("makeReadable(60)", "00:01:00", HumanReadableTimePerfect.makeReadable(60));
        assertEquals("makeReadable(359999)", "99:59:59", HumanReadableTimePerfect.makeReadable(359999));
        assertEquals("makeReadable(10)", "00:00:10", HumanReadableTimePerfect.makeReadable(10));
    }
}
