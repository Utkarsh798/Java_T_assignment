package com.assignment.task_6;


class  Rectangle{
    int length;
    int breadth;

    Rectangle (){
        this.length = 0;
        this.breadth = 0;
    }
    Rectangle(int data){
        this.length = data;
        this.breadth = data;
    }
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;

    }

    double areaOfRectangle(){
        return  length * breadth;
    }
}


public class Answer_5 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Rectangle r1 = new Rectangle(2);
        Rectangle r2 = new Rectangle(1,2);

        System.out.println("Without Data : " + r.areaOfRectangle());
        System.out.println("With one data: "+ r1.areaOfRectangle());
        System.out.println("With two Data: " + r2.areaOfRectangle());
    }
}
