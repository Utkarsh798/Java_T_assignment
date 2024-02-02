package com.assignment.task_1;

public class Answer_3 {
    public static void main(String[] args){
        // using third variable
        System.out.println("Using third variable \n");
        int first_number = 10, second_number = 20, temp;
        System.out.println("Before swap: ");
        System.out.println("First_number = "+ first_number);
        System.out.println("Second_number = "+ second_number);
        temp = second_number;
        second_number = first_number;
        first_number =temp;

        System.out.println("After swap: ");
        System.out.println("First_number = "+ first_number);
        System.out.println("Second_number = "+ second_number);

        // Using without third variable
        System.out.println("\nUsing without third variable ");
        System.out.println("Before swap: ");
        System.out.println("First_number = "+ first_number);
        System.out.println("Second_number = "+ second_number);
        first_number = first_number + second_number;
        second_number = first_number - second_number;
        first_number = first_number - second_number;

        System.out.println("After swap: ");
        System.out.println("First_number = "+ first_number);
        System.out.println("Second_number = "+ second_number);



    }
}
