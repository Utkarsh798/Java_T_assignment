package com.assignment.task_2;
import java.util.*;
public class Answer_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int yr = s.nextInt();

        if(yr % 4 == 0){
            System.out.println("Its a leap year.");
        }else {
            System.out.println("Its not a leap year.");
        }
    }
}
