public class Palindrome {
    public static void main(String[] args) {
        String name = "namman";
        boolean ans = isPalindrome(name);
        System.out.println(ans);
    }

    static boolean isPalindrome(String name) {
        if (name == null || name.length() == 0)
            return true;
        name = name.toLowerCase();
        int i = 0;
        int j = name.length() - 1;
        while (i <= j) {
            if (name.charAt(i) == name.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}