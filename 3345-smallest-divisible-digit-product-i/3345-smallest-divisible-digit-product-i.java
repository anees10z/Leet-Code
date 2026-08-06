class Solution {
    public static int digitsProduct(int n) {
        int product = 1;
        while (n > 0) {
            product = product * (n % 10);
            n = n / 10;
        }
        return product;
    }

    public int smallestNumber(int n, int t) {
        int minNum = 0;
        while (true) {
            int product = digitsProduct(n);
            if (product % t == 0) {
                minNum = n;
                break;
            }
            n++;
        }
        return minNum;
    }
}