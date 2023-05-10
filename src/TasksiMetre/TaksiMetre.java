package TasksiMetre;
import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args) {

        // Scanner sınıfı ile kullanıcıdan mesafe bilgisini alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen mesafe (KM): ");
        int mesafe = input.nextInt();

        // Taksimetre hesaplama işlemi
        double tutar = 10 + (mesafe * 2.20);
        if (tutar < 20) {  // Minimum tutar kontrolü
            tutar = 20;
        }

        // Sonucu ekrana yazdırma
        System.out.println("Taksimetre tutarı: " + tutar + " TL");
    }
}
