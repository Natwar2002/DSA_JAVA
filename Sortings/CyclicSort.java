import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 4, 1 };
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int crr = arr[i] - 1;
            if (arr[i] != arr[crr]) {
                int temp = arr[i];
                arr[i] = arr[crr];
                arr[crr] = temp;
            } else {
                i++;
            }
        }
    }

    // static void cyclicSort(int[] arr) {
    // int i = arr.length - 1;
    // while (i >= 0 && arr[i] != arr[arr[i] - 1]) {
    // int temp = arr[arr[i] - 1];
    // arr[arr[i] - 1] = arr[i];
    // arr[i] = temp;
    // if (arr[i] == arr[arr[i] - 1])
    // i--;
    // }
    // }
}