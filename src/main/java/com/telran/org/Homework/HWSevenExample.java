package com.telran.org.Homework;

public class HWSevenExample {

    public static void main(String[] args) {

        StringBuilder[] stringBuilders = new StringBuilder[2];
        String text = "mama papa";
        System.out.println(text);
        int currentIndex = 0;
        StringBuilder tempBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (' ' == text.charAt(i)) {
                stringBuilders[currentIndex] = tempBuilder;
                currentIndex++;
                tempBuilder = new StringBuilder();
                continue;
            }
            tempBuilder.append(text.charAt(i));
        }
        stringBuilders[currentIndex] = tempBuilder;

        for (int i = stringBuilders.length-1 ; i >=0; i--) {
            StringBuilder stringBuilder1 = stringBuilders[i];
            System.out.print(stringBuilder1.toString() + " ");

        }
}
}
