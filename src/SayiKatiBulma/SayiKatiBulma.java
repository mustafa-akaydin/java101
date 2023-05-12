package SayiKatiBulma;

import java.util.Scanner;

public class SayiKatiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı girin: ");
        int num = input.nextInt();

        System.out.println("4'ün kuvvetleri:");
        int power = 1;
        while (power <= num) {
            System.out.print(power+",");
            power *= 4;
        }

        System.out.println("\n5'in kuvvetleri:");
        power = 1;
        while (power <= num) {
            System.out.print(power+",");
            power *= 5;

        }
    }
}
