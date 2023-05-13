package SayiYazdirma;

import java.util.Scanner;

public class SayiYazdirma {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int n = inp.nextInt();
        System.out.print("Çıktısı : ");
        cikarEkle(n);

    }
     static void cikarEkle(int n) {
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        cikarEkle(n - 5);
        System.out.print(n + " ");
    }

}
