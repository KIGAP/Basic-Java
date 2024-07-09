package com.telran.org.Homework;

import java.util.Random;

public class HomeworkFourTwo {

    public static void main(String[] args) {
        // Создаем объект Random для генерации случайных чисел
        Random random = new Random();

        // Генерируем случайное целое число из диапазона от 0 до 28800
        int n = random.nextInt(28800);

        // Выводим количество оставшихся секунд на экран
        System.out.println("Осталось " + n + " секунд.");

        // Вычисляем количество полных часов, оставшихся до конца рабочего дня
        int hoursLeft = n / 3600;

        // Выводим понятную фразу о количестве полных часов
        if (hoursLeft > 1) {
            System.out.println("Осталось " + hoursLeft + " часов.");
        } else if (hoursLeft == 1) {
            System.out.println("Остался 1 час.");
        } else {
            System.out.println("Осталось менее часа.");
        }
    }
}
