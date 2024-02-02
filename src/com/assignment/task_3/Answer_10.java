package com.assignment.task_3;

import java.util.Scanner;

public class Answer_10 {
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the pattern

        // loop for rows
        for (int i = 0; i < rows; i++) {
            // Print stars for the left side of the pattern
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }

            // Print spaces for the gap between the left and right sides
            for (int k = 0; k < (rows - i - 1) * 4; k++) {
                System.out.print(" ");
            }

            // Print stars for the right side of the pattern
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

    }
}
