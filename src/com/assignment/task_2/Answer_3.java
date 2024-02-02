package com.assignment.task_2;

import java.util.Scanner;

public class Answer_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = s.nextInt();

        System.out.print("Enter to divide number: ");
        int div = s.nextInt();

        int quotient = num / div;
        int reminder = num % div;

        System.out.println("Quotient: " + quotient);
        System.out.println("Reminder: "+ reminder);
    }
}
