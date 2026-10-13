class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len <= 2)
            return len;
        int trackIdx = -1;
        int count = 0;
        int curr = nums[0];

        for (int i = 0; i < len; i++) {
            if (curr == nums[i]) {
                count++;
            // else part: when curr < nums[i]
            } else {
                curr = nums[i];
                count = 1;
            }

            if (count <= 2) {
                nums[++trackIdx] = curr;
            }
        }
        return trackIdx + 1;
    }
}