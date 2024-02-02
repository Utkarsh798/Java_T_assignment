package com.assignment.task_7;

import java.util.Scanner;

public class Answer_8 {
    public static void main(String[] args) {
        // populated array by user
        Scanner s = new Scanner(System.in);

        System.out.println("Enter series of number space in between the number to populate the array: ");
        String S_array_1 = s.nextLine();
        String[] array = S_array_1.split(" ");

        //check the max of them
        int curr_max = Integer.MIN_VALUE;

        for(int i = 0 ; i <array.length; i++){
            curr_max = Math.max(curr_max, Integer.parseInt(array[i]));
        }

        System.out.println("Maximum Number from the array Populated by user: " + curr_max);

    }
}
