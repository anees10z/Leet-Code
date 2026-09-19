class Solution {
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {
        // using Dutch National Flag Algorithm (one pass)
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            // case-1
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            }
            // case-2
            else if (nums[mid] == 1) {
                mid++;
            }
            // case-3 
            else {
                swap(nums, mid, high);
                high--;
            }
        }
    }
}

// using frequency count method (one pass)
// class Solution {
//     public void sortColors(int[] nums) {
//         if (nums.length == 1)
//             return;
//         int[] freq = new int[3];
//         int n = nums.length;
//         for (int i = 0; i < n; ++i) {
//             freq[nums[i]]++;
//         }
//         int len = freq.length;
//         int k = 0;
//         for (int i = 0; i < len; ++i) {
//             while (freq[i] != 0) {
//                 nums[k++] = i;
//                 freq[i]--;
//             }
//         }
//     }
// }