package ru.balmukanov.codewars.datetime.humantime;

import org.junit.Test;
import ru.balmukanov.codewars.datetime.humantime.HumanReadableTime;

import static org.junit.Assert.assertEquals;

public class HumanReadableTimeTest {

    @Test
    public void Tests() {
        assertEquals("makeReadable(86399)", "23:59:59", HumanReadableTime.makeReadable(86399));
        assertEquals("makeReadable(0)", "00:00:00", HumanReadableTime.makeReadable(0));
        assertEquals("makeReadable(5)", "00:00:05", HumanReadableTime.makeReadable(5));
        assertEquals("makeReadable(60)", "00:01:00", HumanReadableTime.makeReadable(60));
        assertEquals("makeReadable(359999)", "99:59:59", HumanReadableTime.makeReadable(359999));
        assertEquals("makeReadable(10)", "00:00:10", HumanReadableTime.makeReadable(10));
    }
}
