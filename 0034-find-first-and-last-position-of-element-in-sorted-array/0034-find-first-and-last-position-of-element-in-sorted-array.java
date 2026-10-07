class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int leftIdx = -1;
        int rightIdx = -1;
        int low = 0;
        int high = nums.length - 1;

        // left boundary
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                leftIdx = mid;
                high = mid - 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        // right boundary
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                rightIdx = mid;
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        res[0] = leftIdx;
        res[1] = rightIdx;

        return res;
    }
}