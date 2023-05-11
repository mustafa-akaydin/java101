package SayiSiralama;

import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        number1 = input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        number2 = input.nextInt();
        System.out.print("3. sayıyı giriniz: ");
        number3 = input.nextInt();
        if (number1 < number2 && number1 < number3) {
            if (number2 < number3) {
                System.out.println("Sıralama: Number1 < Number2 < Number3");
            } else {
                System.out.println("Sıralama: Number1 < Number3 < Number2");
            }
        } else if (number2 < number1 && number2 < number3) {
            if (number1 < number3) {
                System.out.println("Sıralama: Number2 < Number1 < Number3");
            } else {
                System.out.println("Sıralama: Number2 < Number3 < Number1");
            }
        } else if (number3 < number1 && number3 <number2) {
            if (number1 < number2) {
                System.out.println("Sıralama: Number3 < Number1 < Number2");
            } else {
                System.out.println("Sıralama: Number3 > Number2 > Number1");
            }
        }

    }
}
