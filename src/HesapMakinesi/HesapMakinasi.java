package HesapMakinesi;

import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input =new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextInt();
        System.out.println("Yapıcağınız işlemi seçiniz\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();
    switch (select){
        case 1:
            System.out.print("Sonuç : "+ (n1+n2));
            break;
        case 2:
            System.out.print("Sonuç : "+ (n1-n2));
            break;
        case 3:
            System.out.print("Sonuç : "+ (n1*n2));
            break;
        case 4:
            System.out.print("Sonuç : "+ (n1/n2));
            break;

    }

    }
}
