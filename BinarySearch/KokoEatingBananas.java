public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = { 3, 6, 7, 11 };
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }

    static int minEatingSpeed(int[] piles, int h) {
        int start = 1, end = 0;
        for (int pile : piles) {
            end = Math.max(pile, end);
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (canFinish(piles, mid, h)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    private static boolean canFinish(int[] piles, int mid, int h) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + mid - 1) / mid;
        }
        return hours <= h;
    }

}