package UstluSayi;

import java.util.Scanner;

public class UstluSayi {
    public static void main(String[] args) {
        int n,k;

        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini girin: ");
         n = input.nextInt();
        System.out.print("Üs değerini girin: ");
         k = input.nextInt();

        int result = 1;
        for (int i = 1; i <= k; i++) {
            result *= n;
        }
        System.out.println(n + "^" + k + " = " + result);
    }
}
