import java.util.Scanner;

public class recursivePower {

    static int power(int base, int pow) {
        int result = 1;
        for (int i = 1; i <= pow; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, pow;
        do {
            System.out.print("base:");
            base = input.nextInt();
            System.out.print("power:");
            pow = input.nextInt();

            System.out.println("Result:" + power(base, pow));
        } while (base != 0);




    }
}
