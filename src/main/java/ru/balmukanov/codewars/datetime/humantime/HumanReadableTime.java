package ru.balmukanov.codewars.datetime.humantime;

/**
 * Write a function, which takes a non-negative integer (seconds) as input and
 * returns the time in a human-readable format (HH:MM:SS)
 *
 * HH = hours, padded to 2 digits, range: 00 - 99
 * MM = minutes, padded to 2 digits, range: 00 - 59
 * SS = seconds, padded to 2 digits, range: 00 - 59
 * The maximum time never exceeds 359999 (99:59:59)
 *
 * You can find some examples in the test fixtures.
 */
public class HumanReadableTime {

    public static String makeReadable(int seconds) {
        int hour = seconds / 3600;
        seconds -= (hour * 3600);
        int minutes = seconds / 60;
        seconds -= minutes * 60;

        return String.format(
                "%s:%s:%s",
                hour >= 10 ? hour : "0" + hour,
                minutes >= 10 ? minutes : "0" + minutes,
                seconds >= 10 ? seconds : "0" + seconds
        );
    }
}
