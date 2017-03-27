package com.slater.jack.ThoughtworksAssignments;

public class Main {

    public static void main(String[] args) {
        TriangleExercise te = new TriangleExercise();
        System.out.println("Horizontal Line");
        System.out.println(te.drawHorizontalLine(5) + "\n");
        System.out.println("Vertical Line");
        System.out.println(te.drawVerticalLine(5) + "\n");
        System.out.println("Right Triangle");
        System.out.println(te.drawRightTriangle(5) + "\n");

        DiamondExercise de = new DiamondExercise();
        System.out.println("Isosceles Triangle");
        System.out.println(de.drawIsoscelesTriangle(5) + "\n");
        System.out.println("Diamond");
        System.out.println(de.drawDiamond(5) + "\n");
        System.out.println("Diamond with Name");
        System.out.println(de.drawDiamondWithName(5) + "\n");


        System.out.println("FizzBuzz");
	    FizzBuzz fb = new FizzBuzz();
	    fb.FizzBuzzGenerator();
    }
}
