public class Ceil {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 22, 27, 45, 45, 333, 2222, 444444 };
        int target = 33;
        System.out.println(ceil(arr, target));
    }

    static int ceil(int[] arr, int target) {
        if (target > arr[arr.length - 1])
            return -1;
        int start = 0;
        int end = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}