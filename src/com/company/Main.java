package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year : ");
        year = scanner.nextInt();
        boolean isLeapYear = false;

        boolean iszDivisible4 = year % 4 == 0;
        if (iszDivisible4){
            boolean isDivisible100 = year % 100 == 0;
            if (isDivisible100) {
                boolean isDivisible400 = year % 400 == 0;
                if (isDivisible400){
                    isLeapYear = true;

                }
            }else {
                isLeapYear = true;
            }
        }
        if (isLeapYear){
            System.out.printf("%d is a leap year ", year);
        }else {
            System.out.printf("%d is a NOT leap year ", year);
        }
    }

}

