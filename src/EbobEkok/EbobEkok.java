package EbobEkok;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        // kullanıcıdan iki sayı alınır
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int n2 = input.nextInt();
        // büyük sayıyı x ve küçük sayıyı y olarak atayın
        if (n2 > n1) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        int ebob = 1; // başlangıçta EBOB değeri 1 olarak atanır
        int ekok = n1 * n2; // başlangıçta EKOK değeri x * y olarak atanır

        // while döngüsü kullanarak EBOB ve EKOK değerleri hesaplanır
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
            ebob = temp; // son hesaplanan bölüm sonucu EBOB değeridir
        }
        ekok = ekok / ebob; // EKOK değeri, iki sayının çarpımının EBOB'a bölümüdür

        // EBOB ve EKOK değerleri yazdırılır
        System.out.println("Girilen iki sayının EBOB değeri: " + ebob);
        System.out.println("Girilen iki sayının EKOK değeri: " + ekok);
    }
}
