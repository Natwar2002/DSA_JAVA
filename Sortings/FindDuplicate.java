
public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 2 };
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int crr = arr[i] - 1;
            if (arr[i] != arr[crr]) {
                int temp = arr[i];
                arr[i] = arr[crr];
                arr[crr] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return arr[j];
            }
        }
        return -1;
    }
}