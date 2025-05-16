public class Floor {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 22, 45, 333, 2222, 444444 };
        int target = 33;
        System.out.println(floor(arr, target));
    }

    static int floor(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid])
                return mid;
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}