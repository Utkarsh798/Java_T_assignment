package com.assignment.task_3;

import java.net.Socket;
import java.util.Scanner;

public class Answer_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char user_choice;
        int curr_num, max_num = 0;

        do{
            System.out.print("Number: ");
            curr_num = s.nextInt();
            max_num = Math.max(max_num, curr_num);

            System.out.print("Do you wish to add another number (y/n): ");
            user_choice = s.next().charAt(0);

        }while (user_choice =='y' || user_choice == 'Y');

        System.out.println("Max number till now: " + max_num);

    }
}
