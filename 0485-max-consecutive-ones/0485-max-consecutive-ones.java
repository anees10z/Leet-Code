class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        // Approach used -> Sliding Window
        for (int i = 1; i < len; ++i) {
            if (nums[i] == 0)
                continue;
            nums[i] = nums[i] + nums[i - 1];
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; ++i) {
            if (nums[i] > max)
                max = nums[i];
        }

        return max;
    }
}