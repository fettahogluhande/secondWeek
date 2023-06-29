import java.util.Scanner;

public class advancedCalculator {

    static int sum(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static void times(int a, int b) {
        int result;
        result = a * b;
        System.out.println(a + "*" + b + " =" + result + "\n");
    }

    static void divided(int a, int b) {
        int result;
        result = a / b;
        System.out.println("a / b = " + result + "\n");
    }

    static void power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("a ^ b = " + result + "\n");
    }

    static int factorial(int a) {
        int result = 1;
        for (int i = a; i >= 1; i--) {
            result *= i;
        }
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void rectangle(int a, int b) {
        System.out.println("Area of rectangle: " + a * b);
        System.out.println("Circumtance of rectangle : " + 2 * a * b);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Advanced Calculator!");
        System.out.println("Please choose your action what you want to do:\n");
        String menu =
                "1-Sum of numbers\n"
                        + "2-Minus of numbers\n"
                        + "3-Times of numbers\n"
                        + "4-Divide of numbers\n"
                        + "5-Power of numbers\n"
                        + "6-Factorial of number\n"
                        + "7-Mod of numbers\n"
                        + "8-Area and Circumtance of Rectangle\n"
                        + "0-Çıkış\n";
        System.out.println(menu);


        while (true) {

            int select, a, b;
            System.out.print("Enter a select:");
            Scanner input = new Scanner(System.in);
            select = input.nextInt();

            if (select == 0) {
                System.out.println("Çıkış yaptınız!");
                break;
            }

            System.out.print("Enter first number:");
            a = input.nextInt();
            System.out.print("Enter second number:");
            b = input.nextInt();


            switch (select) {
                case 1 -> System.out.println("a + b = " + sum(a, b) + "\n");
                case 2 -> System.out.println("a - b = " + minus(a, b) + "\n");
                case 3 -> times(a, b);
                case 4 -> divided(a, b);
                case 5 -> power(a, b);
                case 6 -> System.out.println("a! = " + factorial(a) + "\n");
                case 7 -> System.out.println("a % b = " + mod(a, b) + "\n");
                case 8 -> rectangle(a, b);
                default -> System.out.println("You entered wrong select number!");
            }

        }


    }
}
