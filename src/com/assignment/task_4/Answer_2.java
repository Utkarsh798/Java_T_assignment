package com.assignment.task_4;

import java.util.Scanner;

public class Answer_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter series of number space in between the number to populate the array: ");
        String number = s.nextLine();

        String[] array = number.split( " ");

        int sum = 0;

        for(int i = 0 ; i < array.length; i++){
            sum += Integer.parseInt(array[i]);
        }
        int avg = sum / array.length;

        System.out.println("Average of the array populated : "+ avg);
    }
}
