import java.util.*;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 3, 4, 4, 4, 1, 3, 4, 2 };
        List<Integer> ans = findAllDuplicates(arr);
        System.out.println(ans);
    }

    static List<Integer> findAllDuplicates(int[] arr) {
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

        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(arr[j]);
            }
        }
        return ans;
    }
}