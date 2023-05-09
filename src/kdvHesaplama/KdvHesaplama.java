package kdvHesaplama;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double kdv_orani_1 = 0.18;
        double kdv_orani_2 = 0.08;
        double fiyat, kdvTutari, kdvliFiyat;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen fiyatı giriniz: ");
        fiyat = input.nextDouble();

        if (fiyat > 0) {
            if (fiyat <= 1000) {
                kdvTutari = fiyat * kdv_orani_1;
                kdvliFiyat = fiyat * (1 + kdv_orani_1);
            } else {
                kdvTutari = fiyat * kdv_orani_2;
                kdvliFiyat = fiyat * (1 + kdv_orani_2);
            }
            System.out.printf("KDV'siz fiyat: ", fiyat);
            System.out.printf("KDV'li fiyat: %.2f\n", kdvliFiyat);
            System.out.printf("KDV tutarı: %.2f\n" + kdvTutari);
        } else {
            System.out.println("Hatalı giriş yaptınız!");
        }
    }
}
