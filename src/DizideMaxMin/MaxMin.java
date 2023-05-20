package DizideMaxMin;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbers = {15, 12, 788, 1, -1, -778, 2, 0};

        System.out.print("Bir sayı girin: ");
        int target = scanner.nextInt();
        int closestLarger = -1;
        int closestSmaller = -1;
        for (int number : numbers) {
            if (number < target && (closestSmaller == -1 || number > closestSmaller)) {
                closestSmaller = number;
            }
            if (number > target && (closestLarger == -1 || number < closestLarger)) {
                closestLarger = number;
            }

        }


        System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);

        scanner.close();
    }
}
