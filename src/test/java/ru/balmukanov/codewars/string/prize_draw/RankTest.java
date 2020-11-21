package ru.balmukanov.codewars.string.prize_draw;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class RankTest {

    private final List<Rank> implementsList = new ArrayList<>() {
        {
            add(new RankFirstAttempt());
            add(new RankBestPractices());
            add(new RankClever());
        }
    };

    @Test
    public void emptyStringTest() {
        String firstNameList = "";
        Integer[] weights = new Integer[] {4, 2, 3, 4};
        int n = 4;

        for (Rank rank : implementsList) {
            assertEquals("No participants", rank.nthRank(firstNameList, weights, n));
        }
    }

    @Test
    public void nullStringTest() {
        Integer[] weights = new Integer[] {4, 2, 3, 4};
        int n = 4;

        for (Rank rank : implementsList) {
            assertEquals("No participants", rank.nthRank(null, weights, n));
        }
    }

    @Test
    public void nGreatOfParticipantsCount() {
        String firstNameList = "Elsa,Amanda,Adam,Ivan";
        Integer[] weights = new Integer[] {4, 2, 3, 4};
        int n = 5;

        for (Rank rank : implementsList) {
            assertEquals("Not enough participants", rank.nthRank(firstNameList, weights, n));
        }
    }

    @Test
    public void simplePositiveTest() {
        String firstNameList = "COLIN,AMANDBA,AMANDAB,CAROL,PauL,JOSEPH";
        Integer[] weights = new Integer[] {1, 4, 4, 5, 2, 1};
        int n = 4;

        for (Rank rank : implementsList) {
            assertEquals("PauL", rank.nthRank(firstNameList, weights, n));
        }
    }

    @Test
    public void simplePositiveTest2() {
        String st = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin";
        Integer[] weights = new Integer[] {4, 2, 1, 4, 3, 1, 2};
        for (Rank rank : implementsList) {
            assertEquals("Benjamin", rank.nthRank(st, weights, 4));
        }
    }
}
