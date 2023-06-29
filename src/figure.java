import java.util.Scanner;

public class figure {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        patternCreator(num, num, -1);
    }

    static void patternCreator(int constantNum, int variableNum, int sign) {
        if (variableNum > constantNum) return;
        if (variableNum < 1) {
            sign *= -1;
        }
        System.out.print(" " + variableNum + " ");
        patternCreator(constantNum, variableNum + sign * 5, sign);
    }

}
