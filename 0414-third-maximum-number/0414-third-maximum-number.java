class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int count = 1;

        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1]) {
                count++;
                if (count == 3) {
                    return nums[i];
                }
            }
        }
        return nums[len - 1];
    }
}