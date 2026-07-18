class Solution {
    public int findGCD(int[] nums) {
        int dividend = Integer.MIN_VALUE;
        int divisor = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > dividend)
                dividend = nums[i];
            if (nums[i] < divisor)
                divisor = nums[i];
        }
        while (true) {
            int rem = dividend % divisor;
            if (rem == 0) break;
            dividend = divisor;
            divisor = rem;
        }
        return divisor;
    }
}