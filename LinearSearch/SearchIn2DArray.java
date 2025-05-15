import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 22, 33, 44 },
                { 45, 20, 10 }
        };
        int target = 10;
        int[] ans = searchIn2DArray(arr, target);
        System.out.println(Arrays.toString(ans));
        int ans1 = findMax(arr);
        System.out.println(ans1);
    }

    static int[] searchIn2DArray(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target)
                    return new int[] { i, j };
            }
        }
        return new int[] { -1, -1 };
    }

    static int findMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] i : arr) {
            for (int j : i) {
                if (j > max) {
                    max = j;
                }
            }
        }
        return max;
    }
}