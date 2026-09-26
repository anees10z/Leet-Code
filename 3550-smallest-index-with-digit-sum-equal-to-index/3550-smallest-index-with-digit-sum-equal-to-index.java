class Solution {
    public int smallestIndex(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len; ++i) {
            int sum = 0;
            int num = nums[i];

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum == i)
                return i;
        }
        return -1;
    }
}