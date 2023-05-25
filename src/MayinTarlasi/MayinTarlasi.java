package MayinTarlasi;

import java.util.Scanner;

public class MayinTarlasi {

    private int satirSayisi;
    private int sutunSayisi;
    private int[][] tahta;
    private int[][] mayinKonumlari;
    private int mayinSayisi;
    private int acilanHucreSayisi;
    private boolean oyunBitti;

    public MayinTarlasi(int satirSayisi, int sutunSayisi) {
        this.satirSayisi = satirSayisi;
        this.sutunSayisi = sutunSayisi;
        this.tahta = new int[satirSayisi][sutunSayisi];
        this.mayinKonumlari = new int[satirSayisi][sutunSayisi];
        this.mayinSayisi = (satirSayisi * sutunSayisi) / 4;
        this.acilanHucreSayisi = 0;
        this.oyunBitti = false;

        mayinlariYerlestir();
    }

    public void mayinlariYerlestir() {
        int kalanMayinSayisi = mayinSayisi;

        while (kalanMayinSayisi > 0) {
            int x = (int) (Math.random() * satirSayisi);
            int y = (int) (Math.random() * sutunSayisi);

            if (mayinKonumlari[x][y] != -1) {
                mayinKonumlari[x][y] = -1;
                kalanMayinSayisi--;
            }
        }
    }

    public void oyunuBaslat() {
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz!");
        tahtayiGoster();

        Scanner scanner = new Scanner(System.in);

        while (!oyunBitti) {
            System.out.print("Satır Giriniz: ");
            int x = scanner.nextInt();

            System.out.print("Sütun Giriniz: ");
            int y = scanner.nextInt();

            if (!gecerliKonum(x, y)) {
                System.out.println("Geçersiz konum! Lütfen tekrar deneyin.");
                continue;
            }

            if (mayinKonumlari[x][y] == -1) {
                oyunBitti = true;
                System.out.println("Game Over!!");
            } else {
                acilanHucreSayisi++;
                int mayinSayisi = mayinlariKontrolEt(x, y);
                tahta[x][y] = mayinSayisi;
                tahtayiGoster();

                if (acilanHucreSayisi == (satirSayisi * sutunSayisi) - mayinSayisi) {
                    oyunBitti = true;
                    System.out.println("Oyunu Kazandınız!");
                }
            }
        }

        scanner.close();
    }

    public void tahtayiGoster() {
        System.out.println("Mayınların Konumu");
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                if (mayinKonumlari[i][j] == -1) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }

        System.out.println("===========================");
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz!");

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                if (tahta[i][j] == -1) {
                    System.out.print("* ");
                } else {
                    System.out.print(tahta[i][j] + " ");
                }
            }
            System.out.println();
        }

        System.out.println("===========================");
    }

    public boolean gecerliKonum(int x, int y) {
        return x >= 0 && x < satirSayisi && y >= 0 && y < sutunSayisi;
    }

    public int mayinlariKontrolEt(int x, int y) {
        int count = 0;

        if (gecerliKonum(x, y + 1) && mayinKonumlari[x][y + 1] == -1) {
            count++;
        }

        if (gecerliKonum(x, y - 1) && mayinKonumlari[x][y - 1] == -1) {
            count++;
        }

        if (gecerliKonum(x + 1, y) && mayinKonumlari[x + 1][y] == -1) {
            count++;
        }

        if (gecerliKonum(x - 1, y) && mayinKonumlari[x - 1][y] == -1) {
            count++;
        }

        if (gecerliKonum(x + 1, y + 1) && mayinKonumlari[x + 1][y + 1] == -1) {
            count++;
        }

        if (gecerliKonum(x + 1, y - 1) && mayinKonumlari[x + 1][y - 1] == -1) {
            count++;
        }

        if (gecerliKonum(x - 1, y + 1) && mayinKonumlari[x - 1][y + 1] == -1) {
            count++;
        }

        if (gecerliKonum(x - 1, y - 1) && mayinKonumlari[x - 1][y - 1] == -1) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Satır Sayısını Giriniz: ");
        int satirSayisi = scanner.nextInt();

        System.out.print("Sütun Sayısını Giriniz: ");
        int sutunSayisi = scanner.nextInt();

        MayinTarlasi oyun = new MayinTarlasi(satirSayisi, sutunSayisi);
        oyun.oyunuBaslat();

        scanner.close();
    }
}


