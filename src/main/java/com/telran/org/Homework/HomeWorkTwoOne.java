package com.telran.org.Homework;

import java.util.Scanner;

public class HomeWorkTwoOne {
    public static void main(String[] args) {
        //scanner - объект для получения данных из консоли
        Scanner scanner = new Scanner(System.in);

        String mamaExample = scanner.next();
        String papaExample = scanner.next();

        int lengthOne = mamaExample.length();
        int lengthTwo = papaExample.length();
        System.out.println("Length of mama: " + lengthOne + " letters");
        System.out.println("Length of papa: " + lengthTwo + " letters");


        String textOne = "mama";
        String substringOne = textOne.substring(0,2);

        String textTwo = "papa";
        String substringTwo = textTwo.substring(2,4);

        String result = substringOne + substringTwo;
        System.out.println(result);
    }
    }
