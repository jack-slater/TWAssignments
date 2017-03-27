package com.slater.jack.ThoughtworksAssignments;

/**
 * Created by jack on 27/03/17.
 */
public class FizzBuzz {

    public void FizzBuzzGenerator () {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
