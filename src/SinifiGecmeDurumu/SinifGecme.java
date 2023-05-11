package SinifiGecmeDurumu;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat, turkce, fizik, kimya, muzik;
        int sum =0;
        Scanner not = new Scanner(System.in);

        System.out.print("Matematik notu giriniz: ");
        mat = not.nextInt();
        if (mat >= 0 && mat <= 100) { // not 0 ile 100 arasındaysa
            sum += mat;
        }
        else {
            System.out.println("Geçersiz not, Müzik notunuz hesaplamaya katılmayacak.");
        }
        System.out.print("Türkçe notu giriniz: ");
        turkce = not.nextInt();

        if(turkce >= 0 && turkce <= 100){
            sum += turkce;
        }
        else {
            System.out.println("Geçersiz not, Müzik notunuz hesaplamaya katılmayacak.");
        }
        System.out.print("Fizik notu giriniz: ");
        fizik = not.nextInt();
        if(fizik >= 0 && fizik <= 100){
            sum += fizik;
        }
        else {
            System.out.println("Geçersiz not, Müzik notunuz hesaplamaya katılmayacak.");
        }
        System.out.print("Kimya notu giriniz: ");
        kimya = not.nextInt();
        if(kimya >= 0 && kimya <= 100){
            sum += kimya;
        }
        else {
            System.out.println("Geçersiz not, Müzik notunuz hesaplamaya katılmayacak.");
        }
        System.out.print("Müzik notu giriniz: ");
        muzik = not.nextInt();
        if(muzik >= 0 && muzik <= 100){
            sum += muzik;
        }
        else {
            System.out.println("Geçersiz not,Müzik notunuz hesaplamaya katılmayacak.");
        }
        double avarage = sum / 5;
        System.out.println("Ortalamanız: "+avarage);

        if (avarage<=55){
            System.out.println("Ortalamanız "+avarage+" olduğu için sınıfta kaldınız, seneye görüşmek üzere !");
        }else {
            System.out.println("Ortalamanız "+avarage+" Tebrkler Sınıfı Geçtiniz");
        }

    }

}
