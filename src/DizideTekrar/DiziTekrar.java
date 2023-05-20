package DizideTekrar;

public class DiziTekrar {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 10, 8, 4, 2, 6, 10, 12, 4, 6};
        System.out.println("Tekrar eden çift sayılar:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) { // Sadece çift sayıları işle
                boolean isDuplicate = false;
                for (int j = 0; j < i; j++) {
                    if (numbers[j] == numbers[i]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (isDuplicate) {
                    System.out.print(numbers[i]+",");
                }
            }
        }

    }
}
