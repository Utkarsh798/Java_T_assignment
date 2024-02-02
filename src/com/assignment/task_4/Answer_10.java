package com.assignment.task_4;

import java.util.*;

public class Answer_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean flag = true;

        System.out.println("First Array: Enter series of number space in between the number to populate the array: ");
        String S_array_1 = s.nextLine();


        String[] array_1 = S_array_1.split(" ");
        int[] int_array_1 = new int[array_1.length];

        System.out.println("Second Array: Enter series of number space in between the number to populate the array: ");
        String S_array_2 = s.nextLine();

        String[] array_2 = S_array_2.split(" ");
        int[] int_array_2 = new int[array_2.length];

        // Convert String[] ito int[] before that check size
        /* since go through one array and checking all the value
           of to second array take O(n) which is same as using Arrays.equal();
         */

        if(array_1.length == array_2.length){
            for (int i = 0 ; i <array_1.length; i++){
                int_array_1[i] = Integer.parseInt(array_1[i]);
                int_array_2[i] = Integer.parseInt(array_2[i]);
            }
            flag = Arrays.equals(int_array_1, int_array_2);
        }else {
            flag = false;
        }

        if(flag){
            System.out.println("Two arrays are Equal.");
        }else{
            System.out.println("Two arrays are NOT equal.");
        }

    }
}
