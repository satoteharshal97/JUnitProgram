package com.example.junitprogram;

import java.util.Scanner;

public class JUnitProgram {
    public static void main(String[] args) {
        temperatureConversion();
    }
    static void temperatureConversion(){
        System.out.println("Enter the temperature in celsius: ");
        Scanner scanner = new Scanner(System.in);
        double Celcius = scanner.nextDouble();
        double Fahrenheit = (Celcius * (9 / 5)) + 32;
        System.out.println("Temperature in Fahrenheit: " + Fahrenheit);
    }
}
