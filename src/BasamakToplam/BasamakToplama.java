package BasamakToplam;

import java.util.Scanner;

public class BasamakToplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = input.nextInt();

        int sum = 0;
        while (number != 0) {
            int digit = number % 10; // son basamağı al
            sum += digit; // son basamağı toplama ekle
            number /= 10; // son basamağı sil
        }

        System.out.println("Basamakların toplamı: " + sum);
    }
}
