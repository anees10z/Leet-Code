class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0, j = 0; i < ans.length; ++i, ++j) {
            ans[i] = nums[j];
            if (j == nums.length - 1) {
                j = -1;
                continue;
            }
        }
        return ans;
    }
}