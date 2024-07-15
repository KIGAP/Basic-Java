package com.telran.org.Homework;

import java.util.Scanner;

public class HomeworkFiveThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запросить у пользователя ввод трех целых чисел
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        // Найти максимальное значение из трех чисел
        int max = findMax(num1, num2, num3);

        // Вывести максимальное значение
        System.out.println("Максимальное из введенных чисел: " + max);

        scanner.close();
    }

    // Метод для нахождения максимального значения из трех чисел
    public static int findMax(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;
    }
}
