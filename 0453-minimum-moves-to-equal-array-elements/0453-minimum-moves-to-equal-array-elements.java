class Solution {
    public int minMoves(int[] nums) {
        boolean isEqual = true;
        int len = nums.length;
        // base case
        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[i - 1]) {
                isEqual = false;
                break;
            }
        }
        if (isEqual)
            return 0;
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int num : nums) {
            min = Math.min(min, num);
        }
        for (int i = 0; i < len; i++) {
            ans += Math.abs(nums[i] - min);

        }
        return ans;
    }
}