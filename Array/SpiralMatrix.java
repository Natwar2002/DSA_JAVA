import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        List<Integer> ans = spiralMatrix(matrix);
        System.out.println(ans);
    }

    static List<Integer> spiralMatrix(int[][] matrix) {
        int top = 0, left = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        List<Integer> ans = new ArrayList<>();

        while (left <= right && top <= bottom) {
            // Top row
            for (int i = top; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            // Right row
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // Bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Left row
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}