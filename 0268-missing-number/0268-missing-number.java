class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int actualSum = len * (len + 1) / 2;
        int sum = 0;
        for (int i = 0; i < len; ++i) {
            sum += nums[i];
        }
        if (actualSum == sum)
            return 0;
        else
            return actualSum - sum;

    }
}