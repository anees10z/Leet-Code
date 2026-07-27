class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length-1;
        int positive = nums[len] * nums[len-1] * nums[len-2];
        int negative = nums[0] * nums[1] * nums[len];
        return Math.max(positive, negative);
    }
}