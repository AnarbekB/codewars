package ru.balmukanov.codewars.algorithms.sum_integer;

/**
 * Task:
 * Given Two integers a , b , find The sum of them , BUT You are not allowed to use the operators + and -
 *
 * Notes:
 * 1 The numbers (a,b) may be positive , negative values or zeros
 * 2 Returning value will be an integer
 * 3 the following methods are prohibited: addExact, average, collect, decrement, increment, nextAfter, nextDown,
 * nextUp, reduce, subtractExact, sum, summing .The following classes are prohibited: BigDecimal and BigInteger
 *
 * Example:
 * 1- Add (5,19) ==> return (24)
 * 2- Add (-27,18) ==> return (-9)
 * 3- Add (-14,-16) ==> return (-30)
 *
 * https://www.codewars.com/kata/5a9c35e9ba1bb5c54a0001ac/train/java
 */
public class SumIntegerAttempt implements SumInteger {
    @Override
    public int add(int x, int y) {
        int xor, and;
        and = x & y;
        xor = x ^ y;

        int temp;
        while (and != 0) {
            //and * 2
            and = and << 1;
            temp = xor ^ and;
            and = and & xor;
            xor = temp;
        }

        return xor;
    }
}
