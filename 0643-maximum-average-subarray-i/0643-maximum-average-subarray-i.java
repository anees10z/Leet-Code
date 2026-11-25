class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0;
        double max = Integer.MIN_VALUE;

        int len = nums.length;

        for (int i = 0; i < k; i++) {
            avg += nums[i];
        }
        max = Math.max(max, avg / k);

        for (int j = k; j < len; j++) {
            avg = avg + nums[j] - nums[j - k];
            max = Math.max(max, avg / k);
        }

        return max;
    }
}