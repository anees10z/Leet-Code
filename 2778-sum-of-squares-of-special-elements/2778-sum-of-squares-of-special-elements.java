class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            int curr = nums[i];
            if (len % (i + 1) == 0)
                sum += (curr * curr);
        }
        return sum;
    }
}