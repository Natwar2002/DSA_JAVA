public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 22, 45, 333, 2222, 444444};
        int target = 22;
        
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        for(int i = start; i <= end; i++) {
            int mid = start + (end - start) / 2;
            // System.out.println(arr[mid]);
            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}