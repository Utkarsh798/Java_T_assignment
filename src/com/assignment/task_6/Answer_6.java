package com.assignment.task_6;

import java.util.Scanner;

class Complex{
    double real;
    double imagenary;
    Complex(double real, double imagenary){
        this.real = real;
        this.imagenary = imagenary;
    }

    // return complex class again for output
    Complex sum(Complex other){
        double sumOfReal = this.real + other.real;
        double sumOfImagnary = this.imagenary + other.imagenary;
        return  new Complex(sumOfReal, sumOfImagnary);

    }

    Complex diff(Complex other){
        double diffOfReal = this.real - other.real;
        double diffOfImagnary = this.imagenary - other.imagenary;
        return  new Complex(diffOfReal, diffOfImagnary);
    }

    Complex product(Complex other){
        double productOfReal = this.real * other.real;
        double productOfImagnary = this.imagenary * other.imagenary;
        return  new Complex(productOfReal, productOfImagnary);
    }

}
public class Answer_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the real and imaginary parts of two complex numbers
        System.out.println("Enter the real and imaginary parts of the first complex number:");
        double real1 = scanner.nextDouble();
        double imaginary1 = scanner.nextDouble();
        Complex number_1 = new Complex(real1, imaginary1);

        System.out.println("Enter the real and imaginary parts of the second complex number:");
        double real2 = scanner.nextDouble();
        double imaginary2 = scanner.nextDouble();
        Complex number_2 = new Complex(real2, imaginary2);

        // Calculate and print the sum, difference, and product
        Complex sum = number_1.sum(number_2);
        Complex difference = number_1.diff(number_2);
        Complex product = number_1.product(number_2);


        System.out.println("Sum: " + sum.real + " + " + sum.imagenary + "i");
        System.out.println("Difference: " + difference.real + " + " + difference.imagenary + "i");
        System.out.println("Product: " + product.real + " + " + product.imagenary + "i");



    }
}
