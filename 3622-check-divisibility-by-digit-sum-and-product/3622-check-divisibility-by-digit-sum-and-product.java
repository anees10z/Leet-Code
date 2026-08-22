class Solution {
    public static int sumProdDigit(int n) {
        int sum = 0;
        int prod = 1;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            prod *= rem;
            n = n / 10;
        }
        return sum + prod;
    }

    public boolean checkDivisibility(int n) {
        int res = sumProdDigit(n);
        if (n % res == 0)
            return true;
        return false;
    }
}