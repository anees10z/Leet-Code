class Solution {
    public long sumAndMultiply(int n) {
        long xTemp = 0;
        long sum = 0;

        while (n != 0) {
            int rem = n % 10;
            if (rem == 0) {
                n = n / 10;
                continue;
            }

            xTemp = xTemp * 10 + rem;
            n = n / 10;
        }

        if (xTemp == 0)
            return 0;
        long x = 0;
        while (xTemp != 0) {
            x = x * 10 + (xTemp % 10);
            sum = sum + xTemp % 10;
            xTemp = xTemp / 10;
        }
        return (long) x * sum;
    }
}