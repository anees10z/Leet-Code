class Solution {
    public static int setbits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0)
                count++;
            n = n >> 1;
        }
        return count;
    }

    public static boolean isPrime(int n) {
        if (n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public int countPrimeSetBits(int left, int right) {
        int primeCount = 0;
        for (int i = left; i <= right; ++i) {
            if (isPrime(setbits(i))) {
                primeCount++;
            }
        }
        return primeCount;
    }
}