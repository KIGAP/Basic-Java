package com.telran.org.lessonEight;

import java.util.Arrays;

public class ChangeExample {

    public static void main(String[] args) {
        int[] array = {4, 6, 3, 9, 1};

        for(int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
        System.out.println(Arrays.toString(array));
    }
}
