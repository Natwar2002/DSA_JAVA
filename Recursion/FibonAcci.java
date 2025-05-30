package DSA.Recursion;

public class FibonAcci {
    public static void main(String[] args) {
        int n = 8;
        int ans = fibo(n);
        System.out.println(ans);
    }

    static int fibo(int n) {
        if (n < 2)
            return n;
        return fibo(n - 1) + fibo(n - 2);
    }
}