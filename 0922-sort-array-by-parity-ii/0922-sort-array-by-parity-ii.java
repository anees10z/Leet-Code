class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int even = 0;
        int odd = 1;
        for (int i : nums) {
            if ((i & 1) == 0) {
                ans[even] = i;
                even += 2;
            } else {
                ans[odd] = i;
                odd += 2;
            }
        }
        return ans;
    }
}