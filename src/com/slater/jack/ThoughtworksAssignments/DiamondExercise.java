package com.slater.jack.ThoughtworksAssignments;

public class DiamondExercise {
    public String drawIsoscelesTriangle (int n) {
        String triangle = "";
        int spaces = n - 1;
        int asterisks = 1;
        while (n > 0) {
            if (triangle.length() > 0) triangle += "\n";
            for (int i = 0; i < spaces; i++) {
                triangle += " ";
            }
            for (int j = 0; j < asterisks; j++) {
                triangle += "*";
            }
            spaces--;
            n--;
            asterisks += 2;
        }
        System.out.println(triangle + "\n");
        return triangle;
    }
}

