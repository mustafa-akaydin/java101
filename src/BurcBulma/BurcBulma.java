package BurcBulma;

import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum gününüzün ayını girin (1-12): ");
        int ay = input.nextInt();

        System.out.print("Doğum gününüzün gününü girin: ");
        int gun = input.nextInt();

        String burc = "";

        if (ay == 1) { // Ocak
            if (gun >= 1 && gun <= 19) {
                burc = "Oğlak Burcusunuz !";
            } else if (gun >= 20 && gun <= 31) {
                burc = "Kova Burcusunuz !";
            }
        } else if (ay == 2) { // Şubat
            if (gun >= 1 && gun <= 18) {
                burc = "Kova Burcusunuz !";
            } else if (gun >= 19 && gun <= 29) {
                burc = "Balık Burcusunuz !";
            }
        } else if (ay == 3) { // Mart
            if (gun >= 1 && gun <= 20) {
                burc = "Balık Burcusunuz !";
            } else if (gun >= 21 && gun <= 31) {
                burc = "Koç Burcusunuz !";
            }
        } else if (ay == 4) { // Nisan
            if (gun >= 1 && gun <= 19) {
                burc = "Koç Burcusunuz !";
            } else if (gun >= 20 && gun <= 30) {
                burc = "Boğa Burcusunuz !";
            }
        } else if (ay == 5) { // Mayıs
            if (gun >= 1 && gun <= 20) {
                burc = "Boğa Burcusunuz !";
            } else if (gun >= 21 && gun <= 31) {
                burc = "İkizler Burcusunuz !";
            }
        } else if (ay == 6) { // Haziran
            if (gun >= 1 && gun <= 20) {
                burc = "İkizler Burcusunuz !";
            } else if (gun >= 21 && gun <= 30) {
                burc = "Yengeç Burcusunuz !";
            }
        } else if (ay == 7) { // Temmuz
            if (gun >= 1 && gun <= 22) {
                burc = "Yengeç Burcusunuz !";
            } else if (gun >= 23 && gun <= 31) {
                burc = "Aslan Burcusunuz !";
            }
        } else if (ay == 8) { // Ağustos
            if (gun >= 1 && gun <= 22) {
                burc = "Aslan Burcusunuz !";
            } else if (gun >= 23 && gun <= 31) {
                burc = "Başak Burcusunuz !";
            }
        } else if (ay == 9) { // Eylül
            if (gun >= 1 && gun <= 22) {
                burc = "Başak Burcusunuz !";
            } else if (gun >= 23 && gun <= 30) {
                burc = "Terazi Burcusunuz !";
            }
        } else if (ay == 10) { // Eylül
            if (gun >= 1 && gun <= 22) {
                burc = "Terazi Burcusunuz !";
            } else if (gun >= 23 && gun <= 31) {
                burc = "Akrep  Burcusunuz !";
            }
        } else if (ay == 11) { // Eylül
            if (gun >= 1 && gun <= 22) {
                burc = "Akrep  Burcusunuz !";
            } else if (gun >= 23 && gun <= 30) {
                burc = "Yay  Burcusunuz !";
            }
        } else if (ay == 12) { // Eylül
            if (gun >= 1 && gun <= 22) {
                burc = "Yay  Burcusunuz !";
            } else if (gun >= 23 && gun <= 31) {
                burc = "Oğlak  Burcusunuz !";
            }
        }
        System.out.println(burc);
    }
}