class Solution {
    public int countValidSelections(int[] nums) {
        if (nums[0] == 0 && nums.length == 1)
            return 2;
        int leftSum = 0, rightSum = 0;
        int count = 0;
        // prefix sum 
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            prefix[i] = nums[i] + prefix[i - 1];
        }
        int end = nums.length - 1;
        for (int i = 0; i < nums.length; ++i) {
            if (i == 0 && nums[i] == 0) {
                leftSum = 0;
                rightSum = prefix[end] - prefix[i];
                if (leftSum == rightSum)
                    count = count + 2;
                else if (Math.abs(leftSum - rightSum) == 1)
                    count = count + 1;
            } else if (i == end && nums[i] == 0) {
                leftSum = prefix[end-1];
                rightSum = 0;
                if (leftSum == rightSum)
                    count = count + 2;
                else if (Math.abs(leftSum - rightSum) == 1)
                    count = count + 1;
            } else if (nums[i] == 0) {
                leftSum = prefix[i - 1];
                rightSum = prefix[end] - prefix[i];
                if (leftSum == rightSum)
                    count = count + 2;
                else if (Math.abs(leftSum - rightSum) == 1)
                    count = count + 1;
            }
        }
        return count;
    }
}