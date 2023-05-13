package RecursivePower;

import java.util.Scanner;

public class RecursivePower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int base = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int top = input.nextInt();
        int result = power(base, top);
        System.out.println(base + "^" + top + " = " + result);
    }

    static int power(int base, int top) {
        if (top == 0)
            return 1;
        else
            return base * power(base, top - 1);
    }
}
