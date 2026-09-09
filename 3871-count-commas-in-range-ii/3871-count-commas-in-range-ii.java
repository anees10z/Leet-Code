class Solution {
    public long countCommas(long n) {
        int len = (int) Math.log10(n) + 1;
        if (len < 4)
            return 0;
        long commas = 0;
        for (long limit = 1000; limit <= n; limit *= 1000) {
            commas = commas + (n - limit + 1);
        }
        return commas;
    }
}