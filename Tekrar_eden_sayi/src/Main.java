public class Main {

    static boolean isFind(int[] arr, int value) {

        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 8, 2, 2, 7, 4,4,3};
        int[] duplicate = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j]) && arr[i]%2==0) {
                    if (!isFind(duplicate, arr[i])) {
                        duplicate[count++] = arr[i];
                        break;
                    }
                }
            }
        }
        for (int value : duplicate) {
            if (value != 0) {
                System.out.println(value);
            }
        }

    }
}