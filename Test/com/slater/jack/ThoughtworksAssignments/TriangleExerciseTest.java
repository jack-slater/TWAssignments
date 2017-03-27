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
}
