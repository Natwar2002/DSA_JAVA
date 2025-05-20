import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 3, 2, -44, 0, 71, 6 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int end = n - i - 1;
            int max = getMax(arr, 0, end);
            swap(arr, max, end);
        }
    }

    static void swap(int[] arr, int max, int end) {
        int temp = arr[max];
        arr[max] = arr[end];
        arr[end] = temp;
    }

    static int getMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}