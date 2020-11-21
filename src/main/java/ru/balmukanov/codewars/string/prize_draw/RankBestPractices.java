package ru.balmukanov.codewars.string.prize_draw;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/reviews/5616964c9bf11dae78000133/groups/592fece5b858481d18000008
 */
public class RankBestPractices implements Rank {
    public String nthRank(String names, Integer[] weights, int n) {
        if (names == null || names.isEmpty()) {
            return "No participants";
        }
        final String[] participants = names.split(",");
        if (participants.length < n) {
            return "Not enough participants";
        }

        List<Participant> participantList = IntStream.range(0, participants.length)
                .mapToObj(i -> new Participant(weights[i], participants[i]))
                .sorted(Comparator.comparing(Participant::getWinningNumber).reversed()
                        .thenComparing(Comparator.comparing(Participant::getName)))
                .collect(Collectors.toList());

        return participantList.get(n - 1).getName();
    }

    static class Participant {

        private String name;
        private int weight;
        private int winningNumber;

        public Participant(int weight, String name) {
            this.winningNumber = weight * (name.toUpperCase().chars()
                    .map(c -> c - 64).sum() + name.length());
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getWinningNumber() {
            return winningNumber;
        }
    }
}
