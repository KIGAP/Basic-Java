package com.telran.org.Homework;

import java.util.Scanner;

public class HomeworkFiveTwo {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите год: " );
        int year = Scanner.nextInt();

        // Проверить, является ли год високосным
        boolean isLeapYear = isLeapYear(year);

        // Вывести результат проверки
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        Scanner.close();
    }

    // Метод для проверки, является ли год високосным
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}