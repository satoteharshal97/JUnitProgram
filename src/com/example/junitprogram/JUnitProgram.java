package com.example.junitprogram;

import java.util.Scanner;

public class JUnitProgram {
    public static void main(String[] args) {
        sqrt();
    }
    static void sqrt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to find square root:");
        double c = scanner.nextDouble();
        double t = c;
        double epsilon = 1e-15;
        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2;
        }
        System.out.println("Square root of "+ c + " is :"+ (int)t);
    }
}
