import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mayın tarlası oyununa hoşgeldiniz?");
        System.out.println();
        System.out.print("Satır sayısı:");
        int row = input.nextInt();
        System.out.print("Sütun sayısı:");
        int column = input.nextInt();

        meinSweeper mine = new meinSweeper(row, column);
        mine.run();
    }
}