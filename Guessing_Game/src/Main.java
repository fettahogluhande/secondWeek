import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int num = rand.nextInt(100);
        System.out.println(num);

        Scanner input = new Scanner(System.in);
        int right = 4;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        while (right >= 0) {
            System.out.print("Tahmininiz: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 aralığında bir değer giriniz!");
                continue;
            }

            if (selected == num) {
                System.out.println("Tebrikler buldunuz!");
                break;
            } else {
                if (selected > num) {
                    System.out.println(selected + " sayısı,number'dan büyüktür.");
                }else {
                    System.out.println(selected + " sayısı , number'dan küçüktür.");
                }
                wrong[(4-right)] = selected;
                System.out.println("Kalan hakkınız : " + right);
            }
            right--;
        }
        if (!isWin){
            System.out.println("-------------------------------------");
            System.out.println("Kaybettiniz!");
            System.out.println("Tahmin ettiğiniz değerler: " + Arrays.toString(wrong));
        }
    }
}