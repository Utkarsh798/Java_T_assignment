package com.assignment.task_7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Answer_3 {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String word = s.nextLine();
        String input_word = word.toLowerCase();
        boolean flag = true;

        Set<Character> store_input_char = new HashSet<>();

        for(char c: input_word.toCharArray()){
            if(c == ' '){
                continue;
            }
            if(store_input_char.contains(c)){
                flag  = false;
                break;
            }else{
                store_input_char.add(c);
            }
        }
        if(flag){
            System.out.println("All are Unique Character of a String.");
        }else {
            System.out.println("NOT all characters are Unique");
        }

    }
}
