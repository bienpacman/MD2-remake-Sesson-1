package com.company;

import java.util.Scanner;

public class Main4 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //quy đổi 1 chiều
//        System.out.println("dollar");
//        int USD = scanner.nextInt();
//        int VND = 23000;
//        int quydoi = VND * USD;
//        System.out.println("VND :" + quydoi);

// Quy đổi 2 chiều sử dụng switch
//        System.out.println("chọn 1 quy đổi USD sang VND, chọn 2 quy đổi VND sang USD");
//        int quydoi = scanner.nextInt();
//        System.out.println("nhập số tiền quy đổi sang USD");
//        double money = scanner.nextInt();
//       switch (quydoi){
//           case 1 :
//               System.out.println( money*23000 + "VND" );
//               break;
//           case 2 :
//               System.out.println(money/23000 + "USD" );
//       }

            //Sử dụng if else
            System.out.println("chọn 1 quy đổi USD sang VND , chọn 2 quy đổi VND sang USD ");
            int quydoi = scanner.nextInt();
            System.out.println("nhập số tiền muốn quy đổi : ");
            double money = scanner.nextInt();
            if (quydoi == 1) {
                System.out.println(money * 23000 + "VND");
            } else {
                System.out.println(money / 23000 + "USD");
            }
        }
    }