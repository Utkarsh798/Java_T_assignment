package com.assignment.task_3;

import java.util.Scanner;

public class Answer_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number until which wants the sum: ");
        int len = s.nextInt();

        int sum = 0;
        int num = 2;
        int count = 1;
        //took first even number as 2 as num = 2

        System.out.print("First " + len + " even numbers are: ");

        while (count <= len){
            sum  += num;
            count ++;
            num  += 2;
        }

        System.out.println(sum);
    }
}
