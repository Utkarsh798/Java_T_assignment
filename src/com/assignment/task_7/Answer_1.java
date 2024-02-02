package com.assignment.task_7;

import java.util.*;

public class Answer_1 {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String input_word = s.nextLine();
        char non_repeating_char = '\u0000';

        Map<Character, Integer> stor_feq_char = new HashMap<>();

        for(char c: input_word.toCharArray()){
            stor_feq_char.put(c, stor_feq_char.getOrDefault(c, 0) + 1);
        }

        for(char c: input_word.toCharArray()){
            if(stor_feq_char.get(c) == 1){
                non_repeating_char = c;
                break;
            }
        }

        System.out.println("First non-repeating character from the word " + input_word + " is " + non_repeating_char + ".");
    }
}
