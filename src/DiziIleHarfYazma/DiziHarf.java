package DiziIleHarfYazma;

public class DiziHarf {
    public static void main(String[] args) {
        int n = 7; // B harfinin boyutu

        char[][] letterB = new char[n][n];

        // B harfini oluştur
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n / 2 || i == n - 1 || j == n - 1) {
                    letterB[i][j] = '*';
                }  else {
                    letterB[i][j] = ' ';
                    letterB[0][6] = ' ';
                    letterB[3][6] = ' ';
                    letterB[6][6] = ' ';
                }
            }
        }

        // B harfini ekrana bastır
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(letterB[i][j] + " ");
            }
            System.out.println();
        }
    }
}
