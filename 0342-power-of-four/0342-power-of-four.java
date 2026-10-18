class Solution {
    public boolean isPowerOfFour(int n) {
        if (n == 1)
            return true;
        if (n < 4)
            return false;
        int zeroCount = 0;

        while (n != 1) {
            if ((n & 1) != 0)
                return false;
            zeroCount++;
            n = n >> 1;
        }
        if (zeroCount % 2 == 0)
            return true;
        return false;
    }
}