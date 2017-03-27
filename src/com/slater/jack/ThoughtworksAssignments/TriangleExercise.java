package com.slater.jack.ThoughtworksAssignments;

/**
 * Created by jack on 27/03/17.
 */
public class TriangleExercise {

    public String drawAsterisk () {
        return "*";
    }

    public String drawHorizontalLine (int n) {
        String line = "";
        while (n > 0) {
            line += "*";
            n--;
        }
        return line;
    }

    public String drawVerticalLine (int n) {
        String line = "";
        while (n > 0) {
            if (line.length() > 0) line += "\n";
            line += "*";
            n--;
        }
        return line;
    }

    public String drawRightTriangle (int n) {
        String triangle = "";
        int i = 1;
        while (i <= n) {
            if (triangle.length() > 0) triangle += "\n";
            int j = i;
            while (j > 0) {
                triangle += "*";
                j--;
            }
            i++;
        }
        System.out.println(triangle + "\n");
        return triangle;
    }
}
