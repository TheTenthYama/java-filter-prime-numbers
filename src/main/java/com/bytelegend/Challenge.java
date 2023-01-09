package com.bytelegend;

import java.util.Arrays;
import java.util.List;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(filterPrimeNumbers(1, 10)));
        System.out.println(Arrays.toString(filterPrimeNumbers(50, 100)));
    }

    /**
     * `filterPrimeNumbers(int start, int end)` method returns an array of all prime numbers in the
     * given `start<=n<=end` range.
     *
     * <p>For example, `filterPrimeNumbers(1, 10)` returns `[2, 3, 5, 7]`.
     *
     * <p>A prime number is a whole number greater than 1 whose only factors are 1 and itself.
     *
     * <p>Tips: for a positive integer `n`, if it's not divisible by any of the integers between 2
     * and `Math.sqrt(n)`, then `n` is a prime number.
     */
    public static int[] filterPrimeNumbers(int start, int end) {
        int[] result = new int[0];
        for (int i = start; i <= end; i++) {
            int PrimeFlag = 1;
            if (i==0 || i == 1) {
                continue;
            }
            if (i == 2 || i == 3) {
                int[] NewResult = new int[result.length + 1];
                for (int k = 0; k < result.length; k++) {
                    NewResult[k] = result[k];
                }
                NewResult[result.length] = i;
                result = NewResult;
                continue;
            }
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    PrimeFlag = 0;
                    break;
                }
            }
            if (PrimeFlag == 1) {
                int[] NewResult = new int[result.length + 1];
                for (int k = 0; k < result.length; k++) {
                    NewResult[k] = result[k];
                }
                NewResult[result.length] = i;
                result = NewResult;
            }
        }
        return result;
    }
}
