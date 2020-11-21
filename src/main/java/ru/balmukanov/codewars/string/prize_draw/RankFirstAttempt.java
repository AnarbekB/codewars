package ru.balmukanov.codewars.string.prize_draw;

import java.util.*;

/**
 * To participate in a prize draw each one gives his/her firstname.
 * Each letter of a firstname has a value which is its rank in the English alphabet.
 * A and a have rank 1, B and b rank 2 and so on.
 *
 * The length of the firstname is added to the sum of these ranks hence a number som.
 * An array of random weights is linked to the firstnames and each som is multiplied by its corresponding weight
 * to get what they call a winning number.
 *
 * Example:
 * names: "COLIN,AMANDBA,AMANDAB,CAROL,PauL,JOSEPH"
 * weights: [1, 4, 4, 5, 2, 1]
 *
 * PauL -> som = length of firstname + 16 + 1 + 21 + 12 = 4 + 50 -> 54
 * The *weight* associated with PauL is 2 so PauL's *winning number* is 54 * 2 = 108.
 *
 * Now one can sort the firstnames in decreasing order of the winning numbers.
 * When two people have the same winning number sort them alphabetically by their firstnames.
 *
 * Task:
 * 1 parameters: st a string of firstnames, we an array of weights, n a rank
 * 2 return: the firstname of the participant whose rank is n (ranks are numbered from 1)
 *
 * Example:
 * names: "COLIN,AMANDBA,AMANDAB,CAROL,PauL,JOSEPH"
 * weights: [1, 4, 4, 5, 2, 1]
 * n: 4
 * return: "PauL"
 *
 * Notes:
 * 1 The weight array is at least as long as the number of names, it can be longer.
 * 2 If st is empty return "No participants".
 * 3 If n is greater than the number of participants then return "Not enough participants".
 * 4 See Examples Test Cases for more examples.
 *
 * https://www.codewars.com/kata/5616868c81a0f281e500005c/train/java
 */
public class RankFirstAttempt implements Rank {
    public String nthRank(String st, Integer[] we, int n) {
        if (st == null || st.length() <= 0) {
            return "No participants";
        }

        String[] names = st.split(",");
        if (names.length < n) {
            return "Not enough participants";
        }

        Map<String, Integer> nameWeightAssoc = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            nameWeightAssoc.put(names[i].trim(), we[i]);
        }

        List<String> sorted = new ArrayList<>();
        Map<String, Integer> nameWeights = new HashMap<>();
        Arrays.stream(names).map(String::trim).forEach(s -> {
            int som = s.length();
            som += s.chars().mapToObj(i -> (char) i)
                    .mapToInt(character -> character)
                    .map(operand -> {
                        if (operand <= 122 & operand >= 97) {
                            //lower char
                            return operand - 96;
                        }
                        if (operand <= 90 & operand >= 65) {
                            //upper char
                            return operand - 64;
                        }

                        throw new RuntimeException("Unknown symbol");
                    })
                    .sum();

            nameWeights.put(s, som * nameWeightAssoc.get(s));
        });

        nameWeights.entrySet().stream().sorted((o1, o2) -> {
            int resultValueCmp = o1.getValue().compareTo(o2.getValue());
            if (resultValueCmp < 0) return 1;
            if (resultValueCmp > 0) return -1;

            int keyCmp = o1.getKey().compareTo(o2.getKey());
            return keyCmp < 0 ? -1 : 1;
        }).forEach(entry -> {
            sorted.add(entry.getKey());
        });

        return sorted.get(n - 1);
    }
}
