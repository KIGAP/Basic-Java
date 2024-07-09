package com.telran.org.Homework;

public class HomeworkFourOne {

    // Метод для нахождения ближайшего числа к 10
    public static double findNearestToTen(double m, double n) {
        // Вычисление разницы каждого числа с 10
        double diffM = Math.abs(10 - m);
        double diffN = Math.abs(10 - n);

        // Сравнение разниц и возврат числа, которое ближе к 10
        return (diffM < diffN) ? m : n;
    }

    public static void main(String[] args) {
        // Пример входных данных
        double m = 10.5;
        double n = 10.45;

        // Нахождение ближайшего к 10 числа
        double nearest = findNearestToTen(m, n);

        // Вывод результата
        System.out.println("Число " + nearest + " ближе к 10.");
    }
}
