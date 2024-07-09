package com.telran.org.Homework;

public class HomeworkThreeTwo {

    // Метод, который принимает строку, преобразует ее в верхний регистр и передает второму методу
    public static String firstMethod(String input) {
        // Преобразование строки в верхний регистр
        String upperCaseString = input.toUpperCase();
        // Вызов второго метода с преобразованной строкой
        String reversedString = secondMethod(upperCaseString);
        // Возвращение результата работы второго метода
        return reversedString;
    }

    // Метод, который принимает строку и возвращает ее в обратном порядке
    public static String secondMethod(String input) {
        // Создание нового объекта StringBuilder с входной строкой
        StringBuilder stringBuilder = new StringBuilder(input);
        // Использование метода reverse() для получения строки в обратном порядке
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        // Пример входной строки
        String originalString = "Hello World";
        // Вызов первого метода с входной строкой и получение результата
        String result = firstMethod(originalString);
        // Вывод результата в консоль
        System.out.println("Result: " + result);
    }
}
