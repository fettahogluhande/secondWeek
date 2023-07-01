import java.util.Scanner;

public class isPalindrom {

    static boolean isPalindrome(int num) {
        int temp = num;
        int lastnumber, reverseNumber = 0;

        while (temp != 0) {
            lastnumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastnumber;
            temp /= 10;
        }
        if (num == reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int num;
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }

    }

}
