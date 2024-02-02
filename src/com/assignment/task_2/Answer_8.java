package com.assignment.task_2;

import java.util.Scanner;

public class Answer_8 {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        int tax_applied;
        double tax_money = 0;

        System.out.println("Enter your Income in Lacs: ");
        double income = s.nextDouble();

        if(income <= 2.5){
            System.out.println("No taxes Applied, Income below tax range.");
            return;
        }

        if(income > 2.5 && income <= 6.0 ){
            tax_applied = 10;
            tax_money = (income * tax_applied) / 100 ;
            System.out.println("Calculated Tax: "+ (tax_money * 100) + " thousand");
        }else if(income > 6.0 && income <= 12.0){
            tax_applied = 18;
            tax_money = (income * tax_applied) / 100 ;
            System.out.println("Calculated Tax: "+ (tax_money * 100) + " thousand");
        }else if(income > 12.0){
            tax_applied = 25;
            tax_money = (income * tax_applied) / 100 ;
            System.out.println("Calculated Tax: "+ (tax_money * 100) + " thousand");
        }

    }
}
