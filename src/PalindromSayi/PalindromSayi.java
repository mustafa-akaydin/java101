package PalindromSayi;

public class PalindromSayi {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {

            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;

        }
        if (number == reverseNumber) {
             System.out.println("Palindrom sayıdır !");
            return true;
        } else {
            System.out.println("Palindrom sayı değildir !");
            return false;
        }
    }

    public static void main(String[] args) {
    isPalindrom(77877);
    }
}
