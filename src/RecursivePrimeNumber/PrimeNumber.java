package RecursivePrimeNumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        if (isAsal(number))
            System.out.println(number + " asal bir sayıdır.");
        else
            System.out.println(number + " asal bir sayı değildir.");
    }

    // Sayının asal olup olmadığını kontrol eden metot
    static boolean isAsal(int number) {
        // Sayı 1'den küçükse asal sayı olamaz, bu nedenle false döndürülür.
        if (number <= 1)
            return false;
            // Sayı 2'ye eşitse asal sayıdır, bu nedenle true döndürülür.
        else if (number == 2)
            return true;
            // Sayı çiftse asal sayı olamaz, bu nedenle false döndürülür.
        else if (number % 2 == 0)
            return false;
            // Yukarıdaki koşulların hiçbiri sağlanmıyorsa, sayının tek sayı olduğu
            // varsayılır ve sayının 3'ten başlayarak tek sayı olup olmadığı kontrol edilir.
        else
            return isAsal(number, 3);
    }

    // Sayının asal olup olmadığını kontrol eden metot (yardımcı metot)
    static boolean isAsal(int number, int i) {
        // Eğer i'nin karesi sayıdan büyükse, sayı asal sayıdır.
        if (i * i > number)
            return true;
            // Eğer sayı i'ye tam bölünüyorsa, sayı asal sayı değildir.
        else if (number % i == 0)
            return false;
        else
            // Yukarıdaki koşulların hiçbiri sağlanmıyorsa, i'ye 2 eklenerek bir sonraki
            // tek sayı olan i+2 ile sayının asallığının kontrol edilmesi için tekrar
            // isAsal metodu çağrılır.
            return isAsal(number, i + 2);
    }
}
