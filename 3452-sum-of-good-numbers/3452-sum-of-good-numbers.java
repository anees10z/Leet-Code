class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;
        int len = nums.length;

        for (int i = 0; i < len; ++i) {
            if ((i - k < 0) && (i + k >= len))
                sum += nums[i];
            else if (i - k < 0) {
                if (nums[i] > nums[i + k])
                    sum += nums[i];
            } else if (i + k >= len) {
                if (nums[i] > nums[i - k])
                    sum += nums[i];
            } else if ((nums[i] > nums[i - k]) && (nums[i] > nums[i + k]))
                sum += nums[i];
        }
        return sum;
    }
}