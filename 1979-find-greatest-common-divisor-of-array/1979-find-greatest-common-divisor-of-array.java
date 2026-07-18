class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > max)
                max = nums[i];
            if (nums[i] < min)
                min = nums[i];
        }
        int divisor = min;
        int dividend = max;
        while (true) {
            int rem = dividend % divisor;
            if (rem == 0) break;
            dividend = divisor;
            divisor = rem;
        }
        return divisor;
    }
}