package Artikyil;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Hesaplanacak Yılı Giriniz :");
        year = input.nextInt();
        boolean artikYilMi = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    artikYilMi = true;
                }
            } else {
                artikYilMi = true;
            }
        }

        if (artikYilMi) {
            System.out.println(year + " bir artık yıldır.");
        } else {
            System.out.println(year + " bir artık yıl değildir.");
        }

    }
}
