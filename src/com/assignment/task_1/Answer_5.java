package com.assignment.task_1;

import java.util.Scanner;

public class Answer_5 {
    public static void main(String[] args){
        System.out.print("Enter the radius of the circle: ");

        Scanner s = new Scanner(System.in);

        int r = s.nextInt();

        double area = 3.14 * r * r;

        System.out.println("The area of a circle: " + area);
    }
}
