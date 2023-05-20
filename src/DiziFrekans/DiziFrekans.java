package DiziFrekans;
import java.util.Arrays;
public class DiziFrekans {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};

        Arrays.sort(array); // Diziyi küçükten büyüğe sırala

        int prevNum = array[0]; // Önceki elemanı başlangıçta ilk eleman olarak atayalım
        int frequency = 1; // Frekansı başlangıçta 1 olarak ayarlayalım

        System.out.println("Tekrar Sayıları:");
        for (int i = 1; i < array.length; i++) {
            int currentNum = array[i];
            if (currentNum == prevNum) {
                frequency++;
            } else {
                System.out.println(prevNum + " sayısı " + frequency + " kere tekrar edildi.");
                prevNum = currentNum;
                frequency = 1;
            }
        }
        // Son elemanın frekansını yazdır
        System.out.println(prevNum + " sayısı " + frequency + " kere tekrar edildi.");
    }
}
