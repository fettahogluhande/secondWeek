import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int count = 1;

        System.out.print("Dizi: ");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sıralı: " + Arrays.toString(arr));

        System.out.println("Tekrar sayıları:");

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                for (int j = 0; j < arr.length; j++) {
                    if ((i != j) && (arr[i] == arr[j])) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " sayısı " + count + " kez tekrar etti.");
            } else if (arr[i] != arr[i - 1]) {
                for (int j = 0; j < arr.length; j++) {
                    if ((i != j) && (arr[i] == arr[j])) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " sayısı " + count + " kez tekrar etti.");
            }
            count = 1;
        }
    }
}