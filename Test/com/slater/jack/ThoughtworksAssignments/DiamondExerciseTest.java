package com.slater.jack.ThoughtworksAssignments;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DiamondExerciseTest {
    @Test
    public void drawIsosceles_lengthOne () {
        DiamondExercise test = new DiamondExercise();
        assertEquals(test.drawIsoscelesTriangle(1), "*");
    }

    @Test
    public void drawIsosceles_lengthTwo () {
        DiamondExercise test = new DiamondExercise();
        assertEquals(test.drawIsoscelesTriangle(2), " *\n***");
    }

    @Test
    public void drawIsosceles_lengthThree () {
        DiamondExercise test = new DiamondExercise();
        assertEquals(test.drawIsoscelesTriangle(3), "  *\n ***\n*****");
    }

    @Test
    public void drawIsosceles_lengthFive () {
        DiamondExercise test = new DiamondExercise();
        assertEquals(test.drawIsoscelesTriangle(5), "    *\n   ***\n  *****\n *******\n*********");
    }

    @Test
    public void drawDiamond_lengthOne () {
        DiamondExercise test = new DiamondExercise();
        assertEquals(test.drawDiamond(1), "*");
    }

    @Test
    public void drawDiamond_lengthTwo () {
        DiamondExercise test = new DiamondExercise();
        assertEquals(test.drawDiamond(2), " *\n***\n *");
    }

    @Test
    public void drawDiamond_lengthThree () {
        DiamondExercise test = new DiamondExercise();
        assertEquals(test.drawDiamond(3 ), "  *\n ***\n*****\n ***\n  *");
    }
}
