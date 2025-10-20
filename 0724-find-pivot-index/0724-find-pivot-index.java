class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0, rightSum = 0;
        // prefix sum in same array
        for (int i = 1; i < nums.length; ++i) {
            nums[i] = nums[i] + nums[i - 1];
        }
        int end = nums.length - 1;
        for (int i = 0; i < nums.length; ++i) {
            if (i == 0) {
                leftSum = 0;
                rightSum = nums[end] - nums[i];
            } else if (i == end) {
                rightSum = 0;
                leftSum = nums[end - 1];
            } else {
                leftSum = nums[i - 1];
                rightSum = nums[end] - nums[i];
            }
            if (leftSum == rightSum)
                return i;
        }
        return -1;
    }
}