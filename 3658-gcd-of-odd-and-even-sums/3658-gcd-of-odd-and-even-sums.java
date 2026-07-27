class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum = n*n;
        int evenSum  = n*(n+1);

        int divisor = oddSum;
        int dividend = evenSum;

        while(true){
            int rem = dividend % divisor;
            dividend = divisor;
            if(rem == 0) break;
            divisor = rem;
        }
        return divisor;
    }
}