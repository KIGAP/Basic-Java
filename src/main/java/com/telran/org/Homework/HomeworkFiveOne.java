package com.telran.org.Homework;

public class HomeworkFiveOne {
    // Метод для проверки, открыт ли хотя бы один магазин
    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen;
        // Используем логическое ИЛИ для проверки, открыт ли хотя бы один магазин
    }

    public static void main(String[] args) {
        // Переменные для состояния магазинов
        boolean isEdekaOpen = true; // Предположим, что Edeka открыт
        boolean isReweOpen = false; // Предположим, что Rewe закрыт

        // Проверяем, могу ли я купить еду
        boolean canBuyFood = canBuy(isEdekaOpen, isReweOpen);

        // Выводим результат
        System.out.println("Я могу купить еду, это " + canBuyFood);
    }
}


