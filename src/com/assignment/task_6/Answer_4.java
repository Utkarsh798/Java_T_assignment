package com.assignment.task_6;

class StudentN{
    String name;

    StudentN(){
        System.out.println("Unknown");
    }
    StudentN(String name){
        this.name = name;
        System.out.println(name);
    }
}


public class Answer_4 {
    public static void main(String[] args) {
        StudentN s1 = new StudentN();
        StudentN s2 = new StudentN("Utkarsh");
    }
}
