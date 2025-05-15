public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = { 4444, 2222, 333, 77, 23, 21, 4, 0, -2, -34 };
        // int[] arr = { 1, 3, 22, 45, 333, 2222, 444444 };
        int target = 222;

        System.out.println(orderAgnosticBS(arr, target));
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] <= arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}