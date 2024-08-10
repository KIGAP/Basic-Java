package com.telran.org.Homework;

public class HWSevenTwo {

    public static void main(String[] args) {
        char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};

        // Объединяем массив в строку
        String str = new String(arr);

        // Заменяем символ '?' на 'e'
        str = str.replace('?', 'e');

        // Выводим результат
        System.out.println(str);
    }
}



