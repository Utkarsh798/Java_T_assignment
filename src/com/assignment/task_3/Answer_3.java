package com.assignment.task_3;

import java.util.Scanner;

public class Answer_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number yo want to check Palindrome: ");
        int number = s.nextInt();
        String palin = String.valueOf(number);
        int left =0;
        int right = palin.length() - 1;
        boolean flag = false;

        while(left < right){
            if(palin.charAt(left) != palin.charAt(right)){
                flag = true;
                break;
            }
            left ++;
            right --;
        }

        if(flag){
            System.out.println("Yes, the number "+ number + " is not Palindrome");
        }else {
            System.out.println("No, the number "+ number + " is Palindrome");
        }
    }
}
