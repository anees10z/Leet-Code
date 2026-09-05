class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] > max)
                max = nums[i];
            int min = Integer.MAX_VALUE;
            for (int j = i; j < n; ++j) {
                if (nums[j] < min)
                    min = nums[j];
            }

            if (max - min <= k)
                return i;
        }
        return -1;
    }
}