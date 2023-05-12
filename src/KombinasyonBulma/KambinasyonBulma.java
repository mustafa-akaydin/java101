package KombinasyonBulma;

import java.util.Scanner;

public class KambinasyonBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n değerini girin: ");
        int n = input.nextInt();

        System.out.print("r değerini girin: ");
        int r = input.nextInt();

        int numerator = 1;
        for (int i = 1; i <= n; i++) {
            numerator *= i;
        }

        int denominator = 1;
        for (int i = 1; i <= r; i++) {
            denominator *= i;
        }
        for (int i = 1; i <= n - r; i++) {
            denominator *= i;
        }

        int result = numerator / denominator;

        System.out.println("C(" + n + "," + r + ") = " + result);
    }
}
