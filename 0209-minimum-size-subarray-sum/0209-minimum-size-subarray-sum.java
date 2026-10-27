class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int min = Integer.MAX_VALUE;
        int removeIdx = 0;
        int sum = 0;
        // variable size sliding window
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            while (sum >= target) {
                min = Math.min(min, i - removeIdx + 1);
                sum -= nums[removeIdx++];
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}