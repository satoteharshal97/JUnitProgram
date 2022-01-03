package com.example.junitprogram;

import java.util.Scanner;

public class JUnitProgram {
    public static void main(String[] args) {
        dayOfWeek();
    }
    static void dayOfWeek(){
        int m0, y0, d0, x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month:");
        int month = scanner.nextInt();
        System.out.println("Enter the year:");
        int year = scanner.nextInt();
        System.out.println("Enter the day:");
        int day = scanner.nextInt();
        String [] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        y0 = year - (14 - month) / 12;
        x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        m0 = month + 12 * ((14 - month) / 12) - 2;
        d0 = (day + x + (31 * m0) / 12) % 7;
        System.out.println(days[d0]);
    }
}
