package com.example.junitprogram;

import java.util.Scanner;

public class JUnitProgram {
    public static void main(String[] args) {
        monthlyPayment();
    }
    static void monthlyPayment(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Years: ");
        double years = scanner.nextDouble();
        System.out.println("Enter Principal amount: ");
        double principal = scanner.nextDouble();
        System.out.println("Enter Rate: ");
        double rate = scanner.nextDouble();
        double n = 12 * years;
        double r = rate / (12 * 100);
        double payment = (principal * r ) / (1 -Math.pow((1 + r), (-n)));
        System.out.println("Monthly Payment : " + payment);
    }
}
