package com.telran.org.Homework;

public class HWSixAppCar {

    public static void main(String[] args) {
        HWSixCar one = new HWSixCar("BMW", 2.3);
        HWSixCar two = new HWSixCar("Audi", 3.5);
        HWSixCar three = new HWSixCar("Mercedes", 4.0);
        HWSixCar four = new HWSixCar("Volkswagen", 2.8);
        HWSixCar five = new HWSixCar("Ford", 3.0);

        // Create array of Car objects
        HWSixCar[] cars = new HWSixCar[5];
        cars[0] = new HWSixCar("BMW", 2.3);
        cars[1] = new HWSixCar("Audi", 3.5);
        cars[2] = new HWSixCar("Mercedes", 4.0);
        cars[3] = new HWSixCar("Volkswagen", 2.8);
        cars[4] = new HWSixCar("Ford", 3.0);

        // Print initial array
        for (HWSixCar car : cars) {
            System.out.println(car);
        }

        bubbleSortByPrice(cars);
        System.out.println("\nSorted by price:");
        printArray(cars);
        ;

        bubbleSortByModel(cars);
        System.out.println("\nSorted by model:");
        printArray(cars);
    }

    // Bubble sort by price
    public static void bubbleSortByPrice(HWSixCar[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - 1 - i; j++) {
                if (cars[j].price > cars[j + 1].price) {
                    // Swap cars[j] and cars[j + 1]
                    HWSixCar temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }

    // Bubble sort by model
    public static void bubbleSortByModel(HWSixCar[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - 1 - i; j++) {
                if (cars[j].model.compareTo(cars[j + 1].model) > 0) {
                    // Swap cars[j] and cars[j + 1]
                    HWSixCar temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }

    // Method to print array
    public static void printArray(HWSixCar[] cars) {
        for (HWSixCar car : cars) {
            System.out.println(car);
        }
    }
}








