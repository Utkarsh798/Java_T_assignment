package com.assignment.task_7;

import java.util.Scanner;

public class Answer_2 {
    public static void main(String[] args) {

        // take 2 array input from the user and convert them into int[]
        Scanner s = new Scanner(System.in);

        System.out.println("First Array: Enter series of number space in between the number to populate the array: ");
        String S_array_1 = s.nextLine();

        String[] array_1 = S_array_1.split(" ");
        int[] int_array_1 = new int[array_1.length];

        System.out.println("Second Array: Enter series of number space in between the number to populate the array: ");
        String S_array_2 = s.nextLine();

        String[] array_2 = S_array_2.split(" ");
        int[] int_array_2 = new int[array_2.length];

        int max_len = Math.max(int_array_1.length, int_array_2.length);
        int min_len = Math.min(int_array_1.length, int_array_2.length);

        //convert String[] to in[]
        for(int i = 0 ; i < max_len; i++){
            if(i < array_1.length){
                int_array_1[i] = Integer.parseInt(array_1[i]);
            }
            if(i < array_2.length){
                int_array_2[i] = Integer.parseInt(array_2[i]);
            }
        }

        // compare with min length of a 2 array to find interaction
        System.out.print("Interaction: ");
        for(int i =0 ; i< min_len; i++){
            if(int_array_1[i] == int_array_2[i]){
                System.out.print(int_array_1[i] + " ");
            }
        }
    }
}
