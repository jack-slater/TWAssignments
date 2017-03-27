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
}
