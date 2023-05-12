package FibonacciSerisi;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        int n,  fib1 = 0, fib2 = 1, fib3; // n: Fibonacci serisinin eleman sayısı, fib1 ve fib2: ilk iki Fibonacci sayısı
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        n = input.nextInt();

        System.out.print(n+" Elemanlı Fibonacci Serisi: "+fib1 + " " + fib2 + " "); // ilk iki sayıyı ekrana yazdır

        for (int i = 1; i < n; i++) { // 1'den n'e kadar olan sayılar için döngü
            fib3 = fib1 + fib2; // sonraki Fibonacci sayısını hesapla
            System.out.print(fib3 + " "); // hesaplanan sayıyı ekrana yazdır
            fib1 = fib2; // sayıları güncelle
            fib2 = fib3;
        }
    }
}
