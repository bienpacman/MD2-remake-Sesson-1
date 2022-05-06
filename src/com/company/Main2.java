package com.company;


import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kg, m, tb;
        System.out.println("cân nặng của bạn(kg) :");
        kg = scanner.nextDouble();

        System.out.println("Chiều cao của bạn(m) :");
        m = scanner.nextDouble();

        tb = kg/ Math.pow(m,2);
        System.out.printf("%-20s%s", "bmi", "Thể trạng\n");

        if (tb < 18)
            System.out.printf("%-20.2f%s", tb, "gầy quá");
        else if (tb < 25.0)
            System.out.printf("%-20.2f%s", tb, "cân đối ");
            else if (tb < 30.0)
            System.out.printf("%-20.2f%s", tb, "Hơi béo");
            else
            System.out.printf("%-20.2f%s", tb, "thừa cân");
        }
    }
