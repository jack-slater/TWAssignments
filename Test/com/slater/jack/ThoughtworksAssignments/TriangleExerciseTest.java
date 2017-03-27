package com.slater.jack.ThoughtworksAssignments;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleExerciseTest {
    @Test
    public void drawAsteriskTest () {
        TriangleExercise test = new TriangleExercise();
        assertEquals(test.drawAsterisk(), "*");
    }

    @Test
    public void drawHorizontalLine_LengthOne () {
        TriangleExercise test = new TriangleExercise();
        assertEquals(test.drawHorizontalLine(1), "*");
    }

    @Test
    public void drawHorizontalLine_LengthTwo () {
        TriangleExercise test = new TriangleExercise();
        assertEquals(test.drawHorizontalLine(2), "**");
    }

    @Test
    public void drawHorizontalLine_LengthThree () {
        TriangleExercise test = new TriangleExercise();
        assertEquals(test.drawHorizontalLine(3), "***");
    }

    @Test
    public void drawHorizontalLine_LengthTen () {
        TriangleExercise test = new TriangleExercise();
        assertEquals(test.drawHorizontalLine(10), "**********");
    }

    @Test
    public void drawVerticalLine_LengthOne () {
        TriangleExercise test = new TriangleExercise();
        assertEquals(test.drawVerticalLine(1), "*");
    }

    @Test
    public void drawVerticalLine_LengthTwo () {
        TriangleExercise test = new TriangleExercise();
        assertEquals(test.drawVerticalLine(2), "*\n*");
    }

    @Test
    public void drawVerticalLine_LengthThree () {
        TriangleExercise test = new TriangleExercise();
        assertEquals(test.drawVerticalLine(3), "*\n*\n*");
    }

    @Test
    public void drawVerticalLine_LengthTen () {
        TriangleExercise test = new TriangleExercise();
        assertEquals(test.drawVerticalLine(10), "*\n*\n*\n*\n*\n*\n*\n*\n*\n*");
    }
}
