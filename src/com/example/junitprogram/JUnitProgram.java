package com.example.junitprogram;

import java.util.Scanner;

public class JUnitProgram {
    public static void main(String[] args) {
        toBinaryNumber();
    }
    static void toBinaryNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to convert to decimal:");
        int decimal = scanner.nextInt();
        int array [] = new int [50];
        int j = 0;
        while (decimal > 0 ) {
            array [j++] = decimal % 2;
            decimal = decimal / 2;
        }
        for(int i = j-1;i >= 0;i--){
            System.out.print(array[i]);
        }
    }
}
