package com.telran.org.Homework;

public class HWSevenOne {

    public static void main(String[] args) {
        // Пример использования метода
        String str1 = "Hello";
        String str2 = "World";
        concatReversStr(str1, str2);
    }

    public static void concatReversStr(String str1, String str2) {
        // Соединяем две строки
        String concatenatedStr = str1 + str2;

        // Создаем StringBuilder для реверса строки
        StringBuilder reversedStr = new StringBuilder(concatenatedStr);

        // Реверс строки
        reversedStr.reverse();

        // Выводим результат на консоль
        System.out.println(reversedStr.toString());
    }
}
