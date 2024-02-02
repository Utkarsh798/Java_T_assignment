package com.assignment.task_7;

import java.util.Scanner;

public class Answer_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number to check Armst15rong Number: ");
        int input_num = s.nextInt();
        int check_num = input_num;

        int to_power = String.valueOf(input_num).length();
        int sum = 0;


        while(check_num != 0){
            int temp = check_num % 10;
            sum += Math.pow(temp,to_power);
            check_num /= 10;
        }

        if(sum == input_num){
            System.out.println("Number is Armstrong.");
        }else{
            System.out.println("Number is NOT Armstrong.");
        }
    }
}
