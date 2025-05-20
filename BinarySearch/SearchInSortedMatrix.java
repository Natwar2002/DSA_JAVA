import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        // int[][] matrix = {
        // { 1, 2, 3, 4 },
        // { 5, 6, 7, 8 },
        // { 9, 10, 11, 12 },
        // { 13, 14, 15, 16 }
        // };
        int[][] matrix = {
                { 1 },
                { 3 }
        };
        int target = 0;
        int[] ans = search(matrix, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0, rEnd = rows - 1, cMid = cols / 2;

        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[cMid][mid] == target) {
                // return true;
                return new int[] { cMid, mid };
            }
            if (target < matrix[cMid][mid]) {
                rEnd = mid;
            } else {
                rStart = mid;
            }
        }

        // For mid col
        if (matrix[rStart][cMid] == target) {
            return new int[] { rStart, cMid };
            // return true;
        }
        if (matrix[rStart + 1][cMid] == target) {
            // return true;
            return new int[] { rStart + 1, cMid };
        }

        if (cMid - 1 >= 0 && target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        if (cMid + 1 < cols && target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        if (cMid - 1 >= 0 && target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                // return true;
                return new int[] { row, mid };
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }
}