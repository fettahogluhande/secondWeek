import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println("Dizi: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sıralı: " + Arrays.toString(arr));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int min = num;
        int max = num;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < min) {
                min = arr[i];
                break;
            }
        }

        for (int j : arr) {
            if (j > max) {
                max = j;
                break;
            }
        }


        System.out.println("En yakın büyük sayı :" + max);
        System.out.println("En yakın küçük sayı :" + min);


    }
}