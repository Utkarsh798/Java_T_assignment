package com.assignment.task_4;

import java.util.Scanner;

public class Answer_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter series of number space in between the number to populate the array: ");
        String number = s.nextLine();

        String[] array = number.split( " ");

        System.out.print("Enter the number you want to find in Array: ");

        int number_to_find = s.nextInt();
        boolean flag = false;
        int idx = 0;

        for (int i = 0 ; i< array.length; i++){
            if(number_to_find == Integer.parseInt(array[i])){
                flag = true;
                idx  = i;
            }
        }

        if(flag){
            System.out.println("The number is found at index " + idx);
        }else{
            System.out.println("Number is NOT Found in array.");
        }

    }
}
