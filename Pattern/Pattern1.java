public class Pattern1 {
    public static void main(String[] args) {
        int row = 4;
        pattern10(row);
    }

    /*
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     */
    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i + 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= n - i + 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int c = i <= 5 ? i : n * 2 - i;
            for (int j = 1; j <= c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int c = i <= 5 ? i : n * 2 - i;
            int space = n - c;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= c; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        // for (int i = 0; i <= n * 2; i++) {
        // if (i <= n) {
        // for (int j = 0; j <= n; j++) {
        // if (j < n - i + 1) {
        // System.out.print(" ");
        // } else {
        // System.out.print(" *");
        // }
        // }
        // } else {
        // for (int j = 0; j <= n; j++) {
        // if (j < i - n + 1) {
        // System.out.print(" ");
        // } else {
        // System.out.print(" *");
        // }
        // }
        // }
        // System.out.println();
        // }
    }

    static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" " + " ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    static void pattern8(int n) {
        for (int i = 1; i <= n * 2; i++) {
            int space = i > 5 ? i - n : n - i;
            int col = i > 5 ? 2 * n - i : i;
            for (int j = 0; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = col; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= col; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    static void pattern9(int n) {
        n = 2 * n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int val = Math.min(Math.min(i, j), Math.min(n - i, n - j));
                System.out.print(val + " ");
            }
            System.out.println(" ");
        }
    }

    static void pattern10(int n) {
        int num = n;
        n = n * 2;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int val = num - (Math.min(Math.min(i, j), Math.min(n - i, n - j)));
                System.out.print(val + " ");
            }
            System.out.println(" ");
        }
    }
}