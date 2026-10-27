class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            int prod = 1;
            for (int j = i; j < len; j++) {
                prod *= nums[j];
                max = Math.max(max, prod);
            }
        }
        return max;
    }
}
// class Solution {
//     public int maxProduct(int[] nums) {
//         int len = nums.length;
//         int max = Integer.MIN_VALUE;
//         int[] left = new int[len];
//         int[] right = new int[len];
//         left[0] = nums[0];
//         right[len - 1] = nums[len - 1];
//         for (int i = 1; i < len; i++) {
//             left[i] = left[i - 1] * nums[i];
//         }
//         for (int i = len - 2; i >= 0; i--) {
//             right[i] = right[i + 1] * nums[i];
//         }

//         for (int i = 0; i < len; i++) {
//             int currMax = Math.max(left[i], right[i]);
//             max = Math.max(max, currMax);
//         }
//         return max;
//     }
// }