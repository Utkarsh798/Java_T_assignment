package com.assignment.task_3;

import java.util.Scanner;

public class Answer_1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.print("Enter the Length of Fibonacci sequence: ");

        int len = s.nextInt();

        // initial values
        int n1 = 0, n2 = 1, n3;

        if(len == 1){
            System.out.println(n1);
        }else if(len == 2){
            System.out.print(n1 + "," + n2);
        }else {
            len -= 2;
            System.out.print(n1 + "," + n2 );
            while(len != 0){
                n3 = n1 + n2;
                System.out.print("," + n3);
                n1 = n2;
                n2 = n3;
                len --;
            }
        }
    }


}
