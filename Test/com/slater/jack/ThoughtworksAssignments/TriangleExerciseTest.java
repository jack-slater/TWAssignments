package com.slater.jack.ThoughtworksAssignments;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleExerciseTest {
    @Test
    public void drawAsteriskTest () {
        TriangleExercise test = new TriangleExercise();
        assertEquals(test.drawAsterisk(), "*");
    }
}
