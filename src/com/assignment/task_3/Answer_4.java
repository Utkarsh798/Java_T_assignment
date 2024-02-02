package com.assignment.task_3;

import java.util.Scanner;

public class Answer_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number to check Prime or not: ");
        int number = s.nextInt();
        boolean flag = true;

        if(number < 2){
            flag = false;
        }else{
            // We go until the square Root of the number itself.
            for(int i = 2; i<= Math.sqrt(number); i++){
                if(number % i == 0){
                    flag = false;
                    break;
                }
            }
        }


        if(!flag){
            System.out.println("No, It's not Prime Number.");
        }else {
            System.out.println("Yes, It's a Prime Number.");
        }
    }
}
