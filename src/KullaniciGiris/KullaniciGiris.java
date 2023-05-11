package KullaniciGiris;

import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String username, password, resetChoice, newPassword;
        username = "kullanici123";
        password = "sifre123";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı girin: ");
        String inpu = scanner.nextLine();
        System.out.print("Şifrenizi girin: ");
        String input = scanner.nextLine();

        if (input.equals(username) && input.equals(password)) { // kullanıcı adı ve şifre doğruysa
            System.out.println("Giriş yapıldı.");
        } else {
            System.out.println("Kullanıcı adı veya şifre yanlış.");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (E/H): ");
            resetChoice = scanner.nextLine();
            if (resetChoice.equalsIgnoreCase("E")) { // şifre sıfırlama isteği
                System.out.print("Lütfen yeni şifrenizi girin: ");
                newPassword = scanner.nextLine();
                if (!newPassword.equals(password)) { // yeni şifre hatalı değilse
                    System.out.println("Şifre oluşturuldu.");
                    password = newPassword; // doğru şifreyi yeni şifre ile güncelle
                } else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }
    }
}
