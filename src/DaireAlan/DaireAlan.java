
package DaireAlan;

import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {

        int r;
        double pi =3.14;
        Scanner inp= new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz: ");
        r = inp.nextInt();
        double alan = pi * r * r;
        double cevre =2 * pi * r;
        System.out.printf("Dairenin alanı: %.2f\n",alan);
        System.out.printf("Dairenin çevresi: %.2f\n",cevre);

    }
}
