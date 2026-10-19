class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        int lessTarget = 0;
        int equalTarget = 0;
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if (nums[i] < target)
                lessTarget++;
            else if (nums[i] == target)
                equalTarget++;
        }

        for (int i = 0; i < equalTarget; i++) {
            res.add(lessTarget + i);
        }

        return res;
    }
}
// class Solution {
//     public List<Integer> targetIndices(int[] nums, int target) {
//         List<Integer> res = new ArrayList<>();
//         Arrays.sort(nums);
//         int leftIdx = -1;
//         int rightIdx = -1;
//         int low = 0;
//         int high = nums.length - 1;

//         // left boundary
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (nums[mid] == target) {
//                 leftIdx = mid;
//                 high = mid - 1;
//             } else if (nums[mid] > target) {
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         // right boundary
//         low = 0;
//         high = nums.length - 1;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (nums[mid] == target) {
//                 rightIdx = mid;
//                 low = mid + 1;
//             } else if (nums[mid] > target) {
//                 high = mid - 1;
//             } else {
//                 low = mid + 1;
//             }
//         }
//         if (leftIdx == -1 && rightIdx == -1)
//             return res;
//         else if (leftIdx == -1) {
//             res.add(rightIdx);
//             return res;
//         } else if (rightIdx == -1) {
//             res.add(leftIdx);
//             return res;
//         }
//         for (int i = leftIdx; i <= rightIdx; i++) {
//             res.add(i);
//         }

//         return res;
//     }
// }