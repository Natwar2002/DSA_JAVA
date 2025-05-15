import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = { 0, 2, 1, 5, 3, 4 };
        int[] ans = RunningSum(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] RunningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}