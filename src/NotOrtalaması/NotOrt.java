package NotOrtalaması;

import java.util.Scanner;

public class NotOrt {
    public static void main(String[] args) {
        int mat, fizik, kimya, tarih,müzik;
        Scanner not = new Scanner(System.in);

        System.out.print("Lütfen notu giriniz: ");
        mat = not.nextInt();
        System.out.print("Lütfen notu giriniz: ");
        fizik = not.nextInt();
        System.out.print("Lütfen notu giriniz: ");
        kimya = not.nextInt();
        System.out.print("Lütfen notu giriniz: ");
        tarih = not.nextInt();
        System.out.print("Lütfen notu giriniz: ");
        müzik = not.nextInt();
        int toplam=(mat+ fizik +kimya +tarih+müzik);
        double ortalama=toplam/5;
        boolean sonuc = ortalama > 60;
        System.out.println(sonuc ? "Sınıfı geçtiniz!" : "Sınıfta kaldınız.");
        not.close();
    }
}
