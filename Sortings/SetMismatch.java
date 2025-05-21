// findErrorNums

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4 };
        int[] ans = setMismatch(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] setMismatch(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int crr = nums[i] - 1;
            if (nums[i] != nums[crr]) {
                int temp = nums[i];
                nums[i] = nums[crr];
                nums[crr] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return new int[] { nums[j], j + 1 };
            }
        }
        return new int[] { -1, -1 };
    }
}