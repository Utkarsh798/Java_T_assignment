package com.assignment.task_2;

import java.util.Scanner;

public class Answer_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Number: ");


        while (true){
            int num = s.nextInt();

            if(num < 0){
                System.out.println("It's Over.");
                break;
            }else if(num >= 0){
                System.out.println("Good going.");
            }
        }
    }
}
