package com.assignment.task_6;

import java.util.Scanner;

class Triangle{
    int side1;
    int side2;
    int side3;

    double perimeterOfTriangle(){
        return  (side1 + side2 + side3) ;
    }

    double areaOfTriangle(){
        double s = perimeterOfTriangle() / 2;
        return  Math.sqrt(s *(s - side1) * (s - side2) * (s - side3));
    }
}


public class Answer_2 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter First Side of Triangle: ");
        t.side1 = s.nextInt();

        System.out.print("Enter Second Side Triangle: ");
        t.side2 = s.nextInt();

        System.out.print("Enter Third Side Triangle: ");
        t.side3 = s.nextInt();
        // again we can add the condition to check Triangle would be possible to make or not and we can limit the values to add

        System.out.println("Perimeter of a Triangle :" + t.perimeterOfTriangle());
        System.out.println("Area of Triangle : " + t.areaOfTriangle());

    }
}
