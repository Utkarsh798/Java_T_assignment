package com.assignment.task_2;

import java.util.Scanner;

public class Answer_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int HRA_parcent, DA_parcent;
        int House_Allowance, Dearness_Allowance;
        int total_gross_salary;

        System.out.println("Enter your basic salary: ");

        int basic_salary = s.nextInt();

        if(basic_salary <=15000){
            HRA_parcent = 25;
            DA_parcent = 82;
            House_Allowance = (HRA_parcent * basic_salary ) / 100 ;
            Dearness_Allowance = (DA_parcent * basic_salary) / 100;
            total_gross_salary = basic_salary + House_Allowance + Dearness_Allowance;
            System.out.println("Gross Salary: "+ total_gross_salary);

        }else if(basic_salary <= 20200){
            HRA_parcent = 27;
            DA_parcent = 90;
            House_Allowance = (HRA_parcent * basic_salary ) / 100 ;
            Dearness_Allowance = (DA_parcent * basic_salary) / 100;
            total_gross_salary = basic_salary + House_Allowance + Dearness_Allowance;
            System.out.println("Gross Salary: "+ total_gross_salary);

        }else if(basic_salary > 20200){
            HRA_parcent = 36;
            DA_parcent = 95;
            House_Allowance = (HRA_parcent * basic_salary ) / 100 ;
            Dearness_Allowance = (DA_parcent * basic_salary) / 100;
            total_gross_salary = basic_salary + House_Allowance + Dearness_Allowance;
            System.out.println("Gross Salary: "+ total_gross_salary);
        }
    }
}
