class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int res[] = new int[2];
        Arrays.sort(nums);
        int j = 0;
        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) {
                res[j++] = nums[i + 1];
            }
        }
        return res;
    }
}