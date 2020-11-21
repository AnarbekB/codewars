package ru.balmukanov.codewars.string.deadfish;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class DeadFishBestPractices {

    /**
     * i - increment
     * d - decrement
     * s - square
     * o - output
     */
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

        List<Integer> output = new ArrayList<>();
        int counter = 0;
        CommandFactory commandFactory = new CommandFactory(output);
        for (char code: commands) {
            Command command = commandFactory.getCommand(code);
            counter = command.execute(counter);
        }
        return output.stream().mapToInt(i -> i).toArray();
    }
}

class CommandFactory {

    private final List<Integer> output;

    public CommandFactory(List<Integer> output) {
        this.output = output;
    }

    Command getCommand(char code) {
        switch (code) {
            case 'i': return new IncrementCommand();
            case 'd': return new DecrementCommand();
            case 's': return new SquareCommand();
            case 'o': return new OutputCommand(output);
        }
        throw new RuntimeException("error");
    }
}

interface Command {
    int execute(int data);
}

class IncrementCommand implements Command {

    @Override
    public int execute(int data) {
        return data+1;
    }
}

class DecrementCommand implements Command {

    @Override
    public int execute(int data) {
        return data-1;
    }
}

class SquareCommand implements Command {

    @Override
    public int execute(int data) {
        return data*data;
    }
}

class OutputCommand implements Command {

    private final List<Integer> output;

    public OutputCommand(List<Integer> output) {
        this.output = output;
    }

    @Override
    public int execute(int data) {
        output.add(data);
        return data;
    }
}