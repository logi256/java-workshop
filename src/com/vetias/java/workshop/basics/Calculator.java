package com.vetias.java.workshop.basics;


public class Calculator {

    public int divide(int a, int b) {
        return a / b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("division: " + calculator.divide(10, 7));
        System.out.println("addition: " + calculator.add(10, 4));
        System.out.println("multiplication: " + calculator.multiply(10, 5));
        System.out.println("subtraction: " + calculator.subtract(10, 2));
    }
}



