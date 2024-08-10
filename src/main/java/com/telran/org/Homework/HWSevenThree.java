package com.telran.org.Homework;

import java.util.ArrayList;
import java.util.List;

public class HWSevenThree {
    public static String reverseWords(String str) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        // Линейный поиск слов в строке
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar != ' ') {
                word.append(currentChar);  // Добавляем символы в слово
            } else {
                words.add(word.toString());  // Добавляем слово в список
                word.setLength(0);  // Очищаем StringBuilder для следующего слова
            }
        }
        words.add(word.toString());  // Добавляем последнее слово

        // Создаем StringBuilder для результата
        StringBuilder reversedString = new StringBuilder();
        for (int i = words.size() - 1; i >= 0; i--) {
            reversedString.append(words.get(i));  // Добавляем слово в обратном порядке
            if (i != 0) {
                reversedString.append(" ");  // Добавляем пробел между словами
            }
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        String originalString = "mama papa";
        String reversedString = reverseWords(originalString);
        System.out.println("Оригинальная строка: " + originalString);
        System.out.println("Строка с обратным порядком слов: " + reversedString);
    }
}





