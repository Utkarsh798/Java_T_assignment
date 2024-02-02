package com.assignment.task_2;
import java.util.*;

public class Answer_2 {
    public static void main(String[] args) {
        System.out.println("Enter the character: ");

        Scanner s = new Scanner(System.in);
         String c = s.nextLine();

         if(Character.isAlphabetic(c.charAt(0))){
             System.out.println("Character is Alphabetic");
         }else {
             System.out.println("Character is not Alphabetic");
         }


    }
}
