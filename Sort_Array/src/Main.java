import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu n: ");
        int num = input.nextInt();

        int[] arr;
        arr = new int[num];

        System.out.println("Dizinin elemanlarını giriniz:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);
        System.out.print("Sıralama: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
}