import java.util.Arrays;

public class BuildArray {
    public static void main(String[] args) {
        int[] nums = { 0, 2, 1, 5, 3, 4 };
        int[] ans = BuildArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] BuildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}