public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -1, -5, 7 };
        int ans = FindMax(arr);
        System.out.println(ans);
    }

    static int FindMin(int[] arr) {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }

    static int FindMax(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
}