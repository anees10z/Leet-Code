class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int[] minSuffix = new int[n];
        for (int j = n - 1; j >= 0; --j) {
            if (nums[j] < min) {
                min = nums[j];
            }
            minSuffix[j] = min;
        }

        for (int i = 0; i < n; ++i) {
            if (nums[i] > max)
                max = nums[i];
            if (max - minSuffix[i] <= k)
                return i;
        }
        return -1;
    }
}