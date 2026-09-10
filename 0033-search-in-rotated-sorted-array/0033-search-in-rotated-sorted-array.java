class Solution {
    public static int findPivotIdx(int[] nums) {
        int l = 0;
        int h = nums.length - 1;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] > nums[h]) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }
        return l;
    }

    public static int binarySearch(int[] nums, int si, int ei, int target) {
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (nums[mid] > target) {
                ei = mid - 1;
            } else if (nums[mid] < target) {
                si = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int idx = -1;
        // min element idx where it rotated
        int pivotIdx = findPivotIdx(nums);
        // binary serach on left side
        idx = binarySearch(nums, 0, pivotIdx - 1, target);
        if (idx != -1) {
            return idx;
        }
        // binary serach on left side
        idx = binarySearch(nums, pivotIdx, nums.length - 1, target);
        return idx;
    }
}