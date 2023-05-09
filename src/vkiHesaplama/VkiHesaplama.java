package vkiHesaplama;

import java.util.Scanner;

public class VkiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        double boy = scanner.nextDouble();

        double vki = kilo / (boy * boy);

        System.out.printf("VKI değeriniz: %.2f\n", vki);

        if (vki < 18.5) {
            System.out.println("Zayıfsınız.");
        } else if (vki < 25) {
            System.out.println("Normalsiniz.");
        } else if (vki < 30) {
            System.out.println("Fazla kilolusunuz.");
        } else {
            System.out.println("Obezsiniz.");
        }
        scanner.close();
    }
}
