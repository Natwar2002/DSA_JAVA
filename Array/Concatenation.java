import java.util.Arrays;

public class Concatenation {

    public static void main(String[] args) {
        int[] nums = { 0, 2, 1, 5, 3, 4 };
        int[] ans = concatenation(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] concatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}