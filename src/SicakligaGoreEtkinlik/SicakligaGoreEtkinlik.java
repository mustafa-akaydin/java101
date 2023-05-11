package SicakligaGoreEtkinlik;

import java.util.Scanner;

public class SicakligaGoreEtkinlik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen sıcaklık değerini giriniz: ");
        int heat = scanner.nextInt();
        /*Switch bloğunda, sıcaklığın
        7.5'ten küçük olması durumunda "Kayak",
        7.5-15 aralığında "Sinema",
        15-25 aralığında "Piknik" ve
        25'ten büyük olması durumunda "Yüzme". etkinliği önerilir.*/
        switch ((int) (heat / 7.5)) {
            case 0:
                System.out.println("Hava çok soğuk, kayak yapabilirsiniz.");
                break;
            case 1:
                System.out.println("Hava biraz soğuk, sinemaya gidebilirsiniz.");
                break;
            case 2:
                System.out.println("Hava güzel, piknik yapabilirsiniz.");
                break;
            default:
                System.out.println("Hava sıcak, yüzme etkinliği yapabilirsiniz.");
                break;
        }
    }
}
