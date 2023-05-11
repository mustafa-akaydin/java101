package UcakBileti;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int distance = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int age = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş-Dönüş): ");
        int travelType = scanner.nextInt();

        double ticketPrice = distance * 0.10;
        double totalPrice;

        if (distance <= 0 || age <= 0 || (travelType != 1 && travelType != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        if (age < 12) {
            ticketPrice *= 0.5;
        } else if (age <= 24) {
            ticketPrice *= 0.9;
        } else if (age >= 65) {
            ticketPrice *= 0.7;
        }

        if (travelType == 2) {
            ticketPrice *= 0.8;
        }

        totalPrice = travelType == 1 ? ticketPrice : ticketPrice * 2;

        System.out.printf("Toplam Tutar = %.2f TL", totalPrice);
    }
}
