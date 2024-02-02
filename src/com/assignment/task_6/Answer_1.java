package com.assignment.task_6;

class Student{
    String name;
    int EnrollmentNo;

    Student(String name, int EnrollmentNo){
        this.name = name;
        this.EnrollmentNo = EnrollmentNo;
    }
}


public class Answer_1 {

    public static void main(String[] args) {
        Student s = new Student("Amay", 132);

        System.out.println("Name of Student: " + s.name);
        System.out.println("Enrollment Number: "+ s.EnrollmentNo);
    }
}
