package com.assignment.task_3;

import java.util.Scanner;

public class Answer_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Factorial Number: ");
        int user_num = s.nextInt();
        int num = 1;

        if(user_num == 0 || user_num == 1){
            System.out.println("Factorial: "+ 1);
        }else{
            for(int i= 1; i<= user_num; i++){
                num *= i;
            }
            System.out.println("Factorial: " + num);
        }




    }
}
