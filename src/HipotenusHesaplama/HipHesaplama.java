package HipotenusHesaplama;

import java.util.Scanner;

public class HipHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. kenar uzunluğunu giriniz: ");
        double a = input.nextDouble();
        System.out.print("2. kenar uzunluğunu giriniz: ");
        double b = input.nextDouble();
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Hipotenüs Değeri : "+ c);

        double u = (a + b + c) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin Alanı: " + alan);
    }
}
