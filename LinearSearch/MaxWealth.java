public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {22, 33, 44},
            {45, 20, 10}
        };
        
        System.out.println(MaxWealth(accounts));
    }

    static int MaxWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] i : accounts){
            int sum = 0;
            for(int j : i) {
                sum += j;
            }
            if(sum > max) max = sum;
            sum = 0;
        }
        return max;
    }
}