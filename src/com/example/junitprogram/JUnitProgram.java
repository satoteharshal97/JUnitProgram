package com.example.junitprogram;

import java.util.Scanner;

public class JUnitProgram {
    public static void main(String[] args) {
        vendingMachine();
    }
    static  void vendingMachine(){
        //Declaring notes in array
        int [] change = {1000, 500, 100, 50, 10, 5, 2, 1};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of which change you want: ");
        int number = scanner.nextInt();
        int totalNotes = 0, noOfNotes;
        if(number > 0){
            for(int p = 0; p < change.length; p++){

                if (change[p] <= number) {
                    noOfNotes = number / change[p];
                    totalNotes = totalNotes + noOfNotes;
                    System.out.println("Notes required of " + change[p] + " = " + noOfNotes );
                    number = number % change[p];
                }
            }
            System.out.println("Minimum Notes required : " + totalNotes);
        }else{
            System.out.println("Change cannot be negative!");
        }
    }
}
