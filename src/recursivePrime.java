import java.util.Scanner;

public class recursivePrime {
    static boolean prime(int a) {
        if (a == 2) {
            return true;
        }
        for (int i = 2; i <= a; i++) {
            return a % i != 0;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a number:");
            num = input.nextInt();
            if (prime(num) == false) {
                System.out.println(num + " Asal sayı değildir!");
            } else {
                System.out.println(num + " Asal sayıdır!");
            }
        } while (num != 0);
    }
}
