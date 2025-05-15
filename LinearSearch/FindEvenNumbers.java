public class FindEvenNumbers {
    public static void main(String[] args) {
        int[] arr = { 1, 2222, 3, 22, 333, 444444, 45, 20, 10 };

        int ans = findEvenNumbers(arr);
        System.out.println(ans);
    }

    static int findEvenNumbers(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (isEven(i)) {
                count++;
            }
        }
        return count;
    }

    static boolean isEven(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count % 2 == 0;
    }
}