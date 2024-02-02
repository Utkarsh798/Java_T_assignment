package com.assignment.task_7;

import java.util.*;

public class Answer_6 {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String sentence = s.nextLine().toLowerCase();

        Map<Character, Integer> frq = new HashMap<>();

        for(char c: sentence.toCharArray()){
            if(c == ' '){
                continue;
            }
            frq.put(c, frq.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry: frq.entrySet()){
            System.out.print("Character : " + entry.getKey());
            System.out.print(" Frequency: " + entry.getValue());
            System.out.println();
        }
        s.close();
    }
}
