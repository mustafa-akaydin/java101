package DizideSira;
import java.util.Arrays;
import java.util.Scanner;
public class DizideSira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Dizinin elemanlarını giriniz:");
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.print("Sıralama: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}