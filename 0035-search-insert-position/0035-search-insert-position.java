class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int low = 0;
        int high = len - 1;
        int res = len;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
}
// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         for(int i = 0; i<nums.length;++i){
//             if(nums[i]==target){
//                 return i;
//             }else if(nums[i]>target){
//                 return i;
//             }
//         }
//         return nums.length;
//     }
// }