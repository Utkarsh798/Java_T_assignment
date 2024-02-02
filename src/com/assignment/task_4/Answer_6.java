package com.assignment.task_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Answer_6 {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int[] input_array = {1,2,3,4,5,6};

        System.out.print("Enter the Target value: ");
        int target = s.nextInt();

        boolean flag = false;


       for(int i = 0 ; i < input_array.length - 1; i++){
           for(int j = i + 1; j < input_array.length; j++){
               if(input_array[i] + input_array[j] == target){
                   flag = true;
                   break;
               }
           }
       }

       if(flag){
           System.out.println("Yes, there exists two numbers which sum equal to "+ target);
       }else {
           System.out.println("No, there is not two numbers that sum equal to "+ target);
       }


    }
}
