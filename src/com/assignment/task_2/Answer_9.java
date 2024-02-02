package com.assignment.task_2;

import java.util.Scanner;

public class Answer_9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double total_charges = 0;
        double surcharges_parcent = 0.2;

        int rang1 = 60;
        int rang2 = 90;
        int rang_3 = 120;
        int rang_4 = 300;


        double rang_1_Rate = 0.30;
        double rang_2_Rate = 0.75;
        double rang_3_Rate = 1.10;
        double rang_4_Rate = 2.50;

        System.out.print(" Enter the total Unit used this Month: ");
        int total_unit_used = s.nextInt();

        if (total_unit_used <= rang1){
            total_charges = total_unit_used * rang_1_Rate;
        }else if(total_unit_used <= rang2){
            total_charges = rang1 * rang_1_Rate + (total_unit_used - rang1) * rang_2_Rate;
        }else if(total_unit_used <= rang_3){
            total_charges = rang1 *rang_1_Rate + rang2 * rang_2_Rate + (total_unit_used - rang1 - rang2 ) * rang_3_Rate;
        }else{
            total_charges = rang1 *rang_1_Rate + rang2 * rang_2_Rate + rang_3 * rang_3_Rate + (total_unit_used - rang_3)* rang_4_Rate;
        }

        double surcharges = total_charges * surcharges_parcent;
        total_charges += surcharges;

        System.out.println("Total bill for this month : $"+ total_charges);


    }
}
