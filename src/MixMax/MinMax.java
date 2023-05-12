package MixMax;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int enteredNumber;
        Scanner inp =new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        enteredNumber = inp.nextInt();
        int max =0;
        int min=0;
        for (int i = 1; i <= enteredNumber; i++) {
            System.out.println(i+". sayıyı giriniz");
            int number = inp.nextInt();
            if (number > max) {
                max =number;
            }
            if (number < min) {
                min =number;
            }
        }
        System.out.println("En büyük sayı: "+max);
        System.out.println("En büyük sayı: "+min);


    }
}
