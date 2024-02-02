package com.assignment.task_2;

import java.util.Scanner;

public class Answer_6 {
    public static void main(String[] args) {
        int result;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int first_num = s.nextInt();

        System.out.println("Enter second number: ");
        int second_num = s.nextInt();

        System.out.println("Enter the Operator want to Perform: ");
        String operator = s.next();

        switch (operator){
            case "+":
                result = first_num + second_num;
                System.out.println("Result: "+ result);
                break;
            case "-":
                result = first_num - second_num;
                System.out.println("Result: "+ result);
                break;
            case "/":
                double result_1 = (double)first_num / second_num;
                System.out.println("Result: "+ result_1);
                break;
            case "*":
                result = first_num * second_num;
                System.out.println("Result: "+ result);
                break;
            case "%":
                result = first_num % second_num;
                System.out.println("Result: "+ result);
                break;
        }

    }
}
