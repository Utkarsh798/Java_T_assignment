package com.assignment.task_4;

import java.util.Scanner;

public class Answer_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter series of number space in between the number to populate the array: ");
        String number = s.nextLine();

        String[] array = number.split( " ");
        System.out.print("Array : [ ");
        for (String sc: array){
            System.out.print(sc + " ");
        }
        System.out.println("]");
    }
}
