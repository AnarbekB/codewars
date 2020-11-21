package ru.balmukanov.codewars.string.deadfish;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Write a simple parser that will parse and run DeadFish.
 *
 * DeadFish has 4 commands, each 1 character long:
 *
 * i increments the value (initially 0)
 * d decrements the value
 * s squares the value
 * o outputs the value into the return array
 * Invalid characters should be ignored.
 *
 * Deadfish.parse("iiisdoso") =- new int[] {8, 64};
 */
public class DeadFish {
    public static int[] parse(String data) {
        Character[] commands = IntStream.range(0, data.toCharArray().length)
                .mapToObj(i -> data.toCharArray()[i])
                .filter(
                        character -> character.equals('i')
                                || character.equals('d')
                                || character.equals('s')
                                || character.equals('o')
                ).toArray(Character[]::new);

        if (commands.length == 0) {
            return new int[] {};
        }

        List<Integer> prints = new ArrayList<>();
        int value = 0;
        for (Character command : commands) {
            switch (command) {
                case 'i':
                    value++;
                    break;
                case 'd':
                    value--;
                    break;
                case 's':
                    value *= value;
                    break;
                case 'o':
                    prints.add(value);
                    break;
            }
        }

        if (prints.size() > 0) {
            return prints.stream().mapToInt(i -> i).toArray();
        }

        return new int[] {};
    }
}
