class Solution {
    public int findNonMinOrMax(int[] nums) {
        // optimize this code for extra loop
        if (nums.length < 3)
            return -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int len = nums.length;
        for (int i = 0; i < 3; ++i) {
            if (nums[i] < min)
                min = nums[i];
            if (nums[i] > max)
                max = nums[i];
        }
        for (int i = 0; i < 3; ++i) {
            if (nums[i] != min && nums[i] != max) {
                return nums[i];
            }
        }
        return -1;
    }
}