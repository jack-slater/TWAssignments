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
        return triangle;
    }

    public String drawLowerDiamond (int n) {
        String diamond = "";
        int spaces = 1;
        int asterisks = (n * 2) - 1;
        while (n > 0) {
            diamond += "\n";
            for (int i = 0; i < spaces; i++) {
                diamond += " ";
            }
            for (int j = 0; j < asterisks; j++) {
                diamond += "*";
            }
            spaces++;
            n--;
            asterisks -= 2;
        }
        return diamond;
    }

    public String drawDiamond (int n) {
        String diamond = "";
        diamond += drawIsoscelesTriangle(n);
        diamond += n == 2 ? "\n *" : drawLowerDiamond(n - 1);
        System.out.println(diamond + "\n");
        return diamond;
    }
}

