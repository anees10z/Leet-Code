class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 1; i < nums.length; ++i) {
            nums[i] += nums[i - 1];
        }

        for (int start = 0; start < nums.length; start++) {
            for (int end = 0; end < nums.length; end++) {
                if (start == 0) {
                    if (nums[end] == k)
                        count++;
                } else {
                    if ((nums[end] - nums[start - 1]) == k)
                        count++;
                }
            }
        }
        return count;
    }
}