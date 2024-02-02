package com.assignment.task_4;

import java.util.Scanner;

public class Answer_9 {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int[] input_array = {1,4,10,-3};

        System.out.print("Enter the Target value: ");
        int target = s.nextInt();

        boolean flag = false;
        int idx= 0;
        int jdx = 0;

        for(int i = 0 ; i < input_array.length - 1; i++){
            for(int j = i + 1; j < input_array.length; j++){
                if(input_array[i] + input_array[j] == target){
                    flag = true;
                    idx = i;
                    jdx = j;
                    break;
                }
            }
        }

        if(flag){
            System.out.println("Two numbers whose sum equal to " + target + " is at [" + idx + "," + jdx + " ].");
        }else {
            System.out.println("No, There is no two number whose sum equal to "+ target + ".");
        }


    }
}
