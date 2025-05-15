public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 73, 11, 3, 3, 2};
        int target = 3;
        int start = 2;
        int end = 6;

        // int ans = LinearSearch(arr, target);

        int ans = searchInRange(arr, start, end, target);
        System.out.println(ans);
    }

    static int LinearSearch(int[] arr, int target) {
        if(arr.length == 0) return -1;

        // for(int i = 0; i < arr.length; i++) {
        //     if(arr[i] == target) return i;
        // }

        for(int element : arr) {
            if(element == target) return element;
        }
        return -1;
    }

    static int searchInRange(int[] arr, int start, int end, int target) {
        if(arr.length == 0) return -1;
        for(int i = start; i <= end; i++) {
            if(arr[i] == target) return i;
        }
        return -1;
    }
}