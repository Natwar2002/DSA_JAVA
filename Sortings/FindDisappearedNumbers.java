import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };

        List<Integer> ans = findDisappearedNumbers(arr);
        System.out.println(ans);
    }

    static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> ans = new ArrayList<>();
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
                ans.add(j + 1);
            }
        }
        return ans;
    }
}