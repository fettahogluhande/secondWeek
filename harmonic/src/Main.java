public class Main {
    public static void main(String[] args) {

        int [] arr = {1,1,1,1};

        double sum = 0;

        for (int j : arr) {
            sum += (double) 1 / j;
        }

        System.out.println(arr.length / sum);
    }
}