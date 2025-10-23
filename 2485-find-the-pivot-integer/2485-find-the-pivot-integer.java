class Solution {
    public int pivotInteger(int n) {
        if (n == 1)
            return 1;
        // create an array and store 1 to n
        int nums[] = new int[n + 1];
        for (int i = 0; i <= n; ++i) {
            nums[i] = i;
        }
        // prefix sum array
        for (int i = 2; i < nums.length; ++i) {
            nums[i] = nums[i] + nums[i - 1];
        }

        int leftSum = 0, rightSum = 0;
        int end = nums.length - 1;

        for (int i = 2; i < nums.length; ++i) {
            leftSum = nums[i];
            rightSum = nums[end] - nums[i - 1];
            if (leftSum == rightSum)
                return i;
        }
        return -1;
    }
}