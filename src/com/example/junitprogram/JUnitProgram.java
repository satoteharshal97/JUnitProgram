package com.example.junitprogram;

import java.util.Arrays;
import java.util.Scanner;

public class JUnitProgram {
    public static void main(String[] args) {
        Binary();
    }
    static void Binary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to convert to decimal:");
        int decimal = scanner.nextInt();
        int array[] = new int[50];
        int j = 0;
        while (decimal > 0) {
            array[j++] = decimal % 2;
            decimal = decimal / 2;
        }

        for (int i = j - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
        System.out.println("");
        int n = 8;
        int[] array1 = Arrays.copyOfRange(array, 1, ((n+1)/2)+1);
        int[] array2 = Arrays.copyOfRange(array, ((n+1)/2), n);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
