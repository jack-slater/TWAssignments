package com.slater.jack.ThoughtworksAssignments;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {
    @Test
    public void generate_number1 () {
        PrimeFactors test = new PrimeFactors();
        ArrayList<Integer> list = new ArrayList<>();
        assertEquals(test.generate(1), list);
    }

    @Test
    public void generate_number2 () {
        PrimeFactors test = new PrimeFactors();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        assertEquals(test.generate(2), list);
    }

    @Test
    public void generate_number30 () {
        PrimeFactors test = new PrimeFactors();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        assertEquals(test.generate(30), list);
    }
}
