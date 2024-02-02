package com.assignment.task_6;

class Employee{
    String name;
    int yearOfJoining;
    int salary;
    String address;
    // the constructor without the parameter is already exists when we create class Employees
    Employee(String name, int yearOfJoining, int salary, String address){
        this.name  = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

}


public class Answer_3 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Robert", 1994, 20000, "64C- Walls Street" );
        Employee e2 = new Employee("Sam", 2000, 15000, "68D- Walls Street");
        Employee e3 = new Employee("John", 1999, 30000, "26B- Walls Street");


        System.out.println("Name \t Year of Joining \t Address");
        System.out.println(e1.name + "\t" + e1.yearOfJoining + "\t" + e1.address);
        System.out.println(e2.name + "\t" + e2.yearOfJoining + "\t" + e2.address);
        System.out.println(e3.name + "\t" + e3.yearOfJoining + "\t" + e3.address);
    }
}
