package com.telran.org.lessonsix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dayAWeek = scan.next();
//        switch (dayAWeek) {
//            case "Monday":
//            case "Tuesday":
//            case "Wednesday":
//            case "Thursday":
//            case "Friday":
//                System.out.println("Work Day");
//                break;
//            case "Sunday":
//            case "Saturday":
//                System.out.println("Weekend");
//                break;
//            default:
//                System.out.println("Incorrect word");
//        }
        if (dayAWeek.equals("Monday") || dayAWeek.equals("Tuesday") || dayAWeek.equals("Wednesday") || dayAWeek.equals("Thursday") || dayAWeek.equals("Friday")) {
            System.out.println("Work Day");
        } else if (dayAWeek.equals("Saturday") || dayAWeek.equals("Sunday")) {
            System.out.println("Incorrect word");
        }
    }
}