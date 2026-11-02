class Solution {
    public static int partition(int nums[], int l, int h) {
        int pivotIdx = h;
        int idx = l;
        while (l < h) {
            if (nums[l] <= nums[pivotIdx]) {
                int temp = nums[l];
                nums[l] = nums[idx];
                nums[idx++] = temp;
            }
            l++;
        }
        int temp = nums[idx];
        nums[idx] = nums[pivotIdx];
        nums[pivotIdx] = temp;
        return idx;
    }

    public static void quickSelect(int[] nums, int mid, int l, int h) {
        if (l < h) {
            int pivot = partition(nums, l, h);
            if (pivot == mid)
                return;
            else if (pivot < mid)
                quickSelect(nums, mid, pivot + 1, h);
            else
                quickSelect(nums, mid, l, pivot - 1);
        }
    }

    public int minMoves2(int[] nums) {
        int len = nums.length;
        // basecase-1 only one element
        if (len == 1)
            return 0;
        // basecase-2 already equal
        boolean isEqual = true;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                isEqual = false;
                break;
            }
        }
        if (isEqual)
            return 0;

        // using quick select algorithm
        int mid = len / 2;
        quickSelect(nums, mid, 0, len - 1);
        int ans = 0;
        for (int i = 0; i < len; i++) {
            ans += Math.abs(nums[i] - nums[mid]);
        }
        return ans;
    }
}