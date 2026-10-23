class Solution {
    public int sortPermutation(int[] nums) {
        Integer ans = -1;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (i != nums[i]) {
                if (ans == -1) {
                    ans = nums[i];
                }
                ans &= nums[i];
            }
        }
        return ans == -1 ? 0 : ans;
    }
}