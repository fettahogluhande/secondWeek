import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan kaça kaçlık bir matris istediğini soruyoruz.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = input.nextByte();
        System.out.print("Enter cols: ");
        int cols = input.nextByte();

        int[][] matris = new int[rows][cols];

        //matrisin içine yazılacak değerleri kullanıcıdan alıyoruz.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matris[" + i + "]" + "[" + j + "]: ");
                matris[i][j] = input.nextInt();
            }
        }

        //Matris
        System.out.println("Matris: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        //Tranpose edilmiş hali
        System.out.println("Transpoze: ");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matris[j][i] + " ");
            }
            System.out.println();
        }


    }
}