package com.telran.org.Homework;

public class HomeworkThreeOne {
    public static int add(int a, int b) {
        int sum = a + b;
        System.out.println("Addition: " + a + " + " + b + " = " + sum);
        return sum;
    }
    public static int sub(int a, int b) {
        int sub = a - b;
        System.out.println("Subtraction: " + a + " - " + b + " = " + sub);
        return sub;
    }
    public static int mult(int a, int b) {
        int mult = a * b;
        System.out.println("Multiplication: " + a + " * " + b + " = " + mult);
        return mult;
    }
    public static int div(int a, int b) {
        if (b != 0) {
            int div = a / b;
            System.out.println("Division: " + a + " / " + b + " = " + div);
            return div;
        }
         return a;

    }
        public static void main (String[]args){
            int a = 20;
            int b = 10;

            int sum = add(a, b);
            int sub = sub(a, b);
            int mult = mult(a, b);
            int div = div(a, b);
        }
    }


