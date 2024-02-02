package com.assignment.task_2;
import java.util.*;

public class Answer_1 {
    public static void main(String[] args){
        System.out.print("Enter the number: ");

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        if(n > 0){
            System.out.println("NUmber is positive");
        }else if(n < 0){
            System.out.println("NUmber is negative");
        }else{
            System.out.println("NUmber is zero");
        }

    }
}
