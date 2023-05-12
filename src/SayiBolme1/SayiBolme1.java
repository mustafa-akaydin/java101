package SayiBolme1;

import java.util.Scanner;

public class SayiBolme1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        int sum = 0;
        int count = 0;

        for (int i =0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {  // 3 ve 4'e tam bölünen sayıları bulma
                sum += i;
                count++;
            }
        }

        if (count > 0) {  // Eğer en az bir sayı bulunduysa
            double average = sum /count;
            System.out.println("Ortalama: " + average);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı yok.");
        }
    }
}
