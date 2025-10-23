class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] answer = new int[nums.length];
        int leftSum = 0, rightSum = 0;
        for (int i = 1; i < nums.length; ++i) {
            nums[i] += nums[i - 1];
        }
        int end = nums.length - 1;
        for (int i = 0; i <= end; ++i) {
            if (i == 0) {
                leftSum = 0;
                rightSum = nums[end] - nums[i];
            } else if (i == end) {
                rightSum = 0;
                leftSum = nums[i - 1];
            } else {
                leftSum = nums[i - 1];
                rightSum = nums[end] - nums[i];
            }
            answer[i] = Math.abs(leftSum - rightSum);
        }
        return answer;
    }
}