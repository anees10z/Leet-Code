class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int firstPositiveIdx = n;
        int lastNegativeIdx = -1;
        int low = 0;
        int high = n - 1;
        // for 1st +ve num as boundary
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > 0) {
                firstPositiveIdx = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        // for last -ve num as boundary
        low = 0;
        high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < 0) {
                lastNegativeIdx = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        int negativeCount = lastNegativeIdx + 1;
        int positiveCount = n - firstPositiveIdx;
        return Math.max(negativeCount, positiveCount);
    }
}