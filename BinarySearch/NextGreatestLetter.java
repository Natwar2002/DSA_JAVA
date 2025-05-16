public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = { 'a', 'b', 'm', 'n' };
        char target = 'c';
        System.out.println(nextGreatestLetter(letters, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
    }

}