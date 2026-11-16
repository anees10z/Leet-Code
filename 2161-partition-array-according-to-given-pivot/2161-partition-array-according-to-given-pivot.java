//optimized
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        int n = nums.length;
        int[] result = new int[n];

        int k = 0;
        int equal = 0;

        // Smaller elements
        for (int num : nums) {
            if (num < pivot) {
                result[k++] = num;
            } else if (num == pivot) {
                equal++;
            }
        }

        // Equal elements
        while (equal-- > 0) {
            result[k++] = pivot;
        }

        // Greater elements
        for (int num : nums) {
            if (num > pivot) {
                result[k++] = num;
            }
        }

        return result;
    }
}

// class Solution {
//     public int[] pivotArray(int[] nums, int pivot) {
//         int len = nums.length;
//         int[] left = new int[len - 1];
//         int[] right = new int[len - 1];
//         int l = 0, r = 0;
//         int same = 0;
//         for (int i = 0; i < len; i++) {
//             if (nums[i] > pivot)
//                 right[r++] = nums[i];
//             else if (nums[i] < pivot)
//                 left[l++] = nums[i];
//             else
//                 same++;
//         }
//         int k = 0;
//         //left
//         for (int i = 0; i < l; i++)
//             nums[k++] = left[i];
//         // same
//         for (int i = 0; i < same; i++)
//             nums[k++] = pivot;
//         for (int i = 0; i < r; i++)
//             nums[k++] = right[i];
//         return nums;
//     }
// }
