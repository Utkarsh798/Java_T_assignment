package com.assignment.task_7;

import java.util.Scanner;

public class Answer_4 {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String sentence = s.nextLine();
        String[] words = sentence.split(" ");

        System.out.println("Number of words in this Sentences are " + words.length + ".");
    }
}
