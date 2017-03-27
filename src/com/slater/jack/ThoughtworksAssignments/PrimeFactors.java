package com.slater.jack.ThoughtworksAssignments;

import java.util.ArrayList;

/**
 * Created by jack on 27/03/17.
 */
public class PrimeFactors {

    public ArrayList<Integer> generate (int n) {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                if (n % i == 0) {
                    primeFactors.add(i);
                }
            }
        }
        return primeFactors;
    }

    private boolean isPrime (int n) {
        if (n == 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
