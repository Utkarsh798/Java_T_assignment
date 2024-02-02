package com.assignment.task_2;
import java.util.*;
public class Answer_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your Percentage: ");
        int parcent = s.nextInt();

        if(parcent >= 90){
            System.out.println("Grade A");
        }else if(parcent >= 75){
            System.out.println("Grade B");
        }else if(parcent >= 65){
            System.out.println("Grade C");
        }else {
            System.out.println("Fail");
        }

    }
}
