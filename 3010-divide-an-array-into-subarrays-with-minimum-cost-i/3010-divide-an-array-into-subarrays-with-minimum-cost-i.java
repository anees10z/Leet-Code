class Solution {
    public int minimumCost(int[] nums) {
        int sum = nums[0];
        int idx = 0;
        int minVal = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] < minVal) {
                minVal = nums[i];
                idx = i;
            }
        }
        sum += minVal;
        minVal = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] <= minVal && idx != i) {
                minVal = nums[i];
            }
        }
        return sum + minVal;
    }
}