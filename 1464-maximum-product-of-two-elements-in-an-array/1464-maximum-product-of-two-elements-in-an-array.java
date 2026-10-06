class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = max;
        for (int num : nums) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num >= secondMax) {
                secondMax = num;
            }
        }
        return (max - 1) * (secondMax - 1);
    }
}
// class Solution {
//     public int maxProduct(int[] nums) {
//         Arrays.sort(nums);
//         return (nums[nums.length-1]-1) * (nums[nums.length-2]-1);
//     }
// }