package com.assignment.task_3;

import java.util.Scanner;

public class Answer_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char user_choice;
        do {
            System.out.print("Enter first number: ");
            int firs_num = s.nextInt();
            System.out.print("Enter second number: ");
            int second_num = s.nextInt();
            System.out.println("The sum of " + firs_num + " and " + second_num + " is: " + (firs_num + second_num));

            System.out.println("Do you wish to continue (y / n): ");
            user_choice = s.next().charAt(0);


        } while (user_choice == 'y' || user_choice == 'Y');
        System.out.println("Thank you.");
        s.close();
    }
}
