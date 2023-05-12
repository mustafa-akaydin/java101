import java.util.Scanner;

public class SayiBolme2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Sayı girin (Programı sonlandırmak için tek sayı girin): ");
            int num = input.nextInt();

            if (num % 2 == 1) {
                break;
            }

            if (num % 2 == 0 && num % 4 == 0) {
                sum += num;
            }
        }

        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + sum);
    }
}