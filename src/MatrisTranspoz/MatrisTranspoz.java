package MatrisTranspoz;

public class MatrisTranspoz {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        // Matrisin transpozunu oluştur
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Transpoz matrisi ekrana yazdır
        System.out.println("Matris:");
        printMatrix(matrix);

        System.out.println("Transpoz:");
        printMatrix(transpose);
    }

    // Matrisi ekrana yazdıran yardımcı metod
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
