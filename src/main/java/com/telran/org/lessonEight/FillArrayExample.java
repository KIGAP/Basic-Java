package com.telran.org.lessonEight;

import java.util.Arrays;

public class FillArrayExample {

    public static void main(String[] args) {
        int[] ints = new int[100];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
        }
        System.out.println("Array = " + Arrays.toString(ints));
    }
}
