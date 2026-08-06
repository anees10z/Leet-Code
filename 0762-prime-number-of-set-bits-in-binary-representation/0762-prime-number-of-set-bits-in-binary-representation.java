class Solution {
    public static boolean isPrime(int n) {
        if (n == 1)
            return false;
        if (n == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; ++i) {
            int count = Integer.bitCount(i);
            if (isPrime(count))
                ans++;
        }
        return ans;
    }
}