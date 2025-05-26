package DSA.Recursion;

public class BS {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 7, 9, 11, 34, 56, 67, 78, 79 };
        int target = 78;
        int ans = search(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return search(arr, target, mid + 1, e);
        } else {
            return search(arr, target, s, mid - 1);
        }
    }
}