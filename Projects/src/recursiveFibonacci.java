import java.util.Scanner;
public class recursiveFibonacci {
    static  int fib(int num){
        if(num == 1 || num == 2 ){
            return 1;
        }
        return fib(num-1)+ fib(num -2);
    }
    public static void main(String[] args) {
        //1 1 2 3 5 8 13 21
        int num;
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        System.out.println(fib(num));
    }
}
