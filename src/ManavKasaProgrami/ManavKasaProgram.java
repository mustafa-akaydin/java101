package ManavKasaProgrami;

import java.util.Scanner;

public class ManavKasaProgram {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67 ,domates=1.11,muz=0.95,patlican=5.00 ;

        Scanner kilo = new Scanner(System.in);

        //kilo bilgilerini kullanıcıdan alıyoruz
        System.out.print("Armut Kaç Kilo : ");
        double armutKilo = kilo.nextDouble();
        System.out.print("Elma  Kaç Kilo : ");
        double elmaKilo = kilo.nextDouble();
        System.out.print("Domates  Kaç Kilo : ");
        double domatesKilo = kilo.nextDouble();
        System.out.print("Muz Kaç Kilo : ");
        double muzKilo = kilo.nextDouble();
        System.out.print("Patlıcan  Kaç Kilo : ");
        double patlicanKilo = kilo.nextDouble();

        //meyveleri alınan kilo ile çarpıyoruz
        double armutFiyat = armut * armutKilo;
        double elmaFiyat = elma * elmaKilo;
        double domatesFiyat = domates * domatesKilo;
        double muzFiyat = muz * muzKilo;
        double patlicanFiyat = patlican * patlicanKilo;

        //toplam fiyatı ölçüyoruz
        double toplam = armutFiyat+elmaFiyat+domatesFiyat+muzFiyat+patlicanFiyat;
        //ekrana yazıdrııyoruz
        System.out.printf("Toplam Tutar: %.2f\n" , toplam);


    }
}
