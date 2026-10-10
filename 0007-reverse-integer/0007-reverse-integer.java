class Solution {
    public int reverse(int x) {
        long temp = Math.abs((long) x);
        long rev = 0;

        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }

        if (rev > Integer.MAX_VALUE)
            return 0;

        int ans = (int) rev;
        return x < 0 ? -ans : ans;
    }
}