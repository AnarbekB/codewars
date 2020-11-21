package ru.balmukanov.codewars.string.prize_draw;

import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/reviews/5616964c9bf11dae78000133/groups/59caca5509394a96150000c7
 */
public class RankClever implements Rank {
    @Override
    public String nthRank(String st, Integer[] we, int n) {
        if (st == null || st.isEmpty()) {
            return "No participants";
        } else {
            String[] names = st.split(",");
            String[] sorted = IntStream.range(0, names.length)
                    .boxed()
                    .sorted(Comparator.<Integer>comparingInt(i -> this.getScore(i, names, we)).reversed().thenComparing(i -> names[i]))
                    .map(i -> names[i])
                    .toArray(String[]::new);
            return n <= sorted.length ? sorted[n - 1] : "Not enough participants";
        }
    }

    private int getScore(int i, String[] names, Integer[] we) {
        return names[i].chars().map(c -> Character.toUpperCase(c) - 'A' + 1).reduce(names[i].length(), Integer::sum) * we[i];
    }
}
