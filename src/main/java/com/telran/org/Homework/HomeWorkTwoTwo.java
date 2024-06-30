package com.telran.org.Homework;

public class HomeWorkTwoTwo {
    public static void main(String[] args) {

        String text = "I study basic Java!";
        System.out.println(text);
        System.out.println("I study basic Java!");

        char temp = text.charAt(18);
        System.out.println("The last simbol is " + temp);

        boolean result = text.contains("Java");
        System.out.println("Text contains Java = " + result);

        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());

        String partOfString = text.substring(14,18);
        System.out.println(partOfString);
    }
}
