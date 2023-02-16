package com.bytelegend;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        for(int i=start; i<=end; i++)
            if(prime(i)) // if i prime
                primeNumbers.add(i);
        if(primeNumbers==null||start>end)
            return new int[]{};
        else{
            int[] result = new int[primeNumbers.size()];
            for(int i=0; i<primeNumbers.size(); i++)
                result[i] = primeNumbers.get(i);
            return result;
        }
    }
    public static boolean prime(int a) {
        if(a<=1)
            return false;
        if(a==2)
            return true;
        for(int b=2; b<Math.sqrt(a)+1; b++)
            if(a%b==0)
                return false;
        return true;
    }
}
