public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = { 3, 4, -1, 1 };
        int ans = firstMissingPositive(nums);
        System.out.println(ans);
    }

    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int crr = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[crr]) {
                int temp = nums[i];
                nums[i] = nums[crr];
                nums[crr] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }
        return nums.length + 1;
    }
}