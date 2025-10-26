class Solution {
    public int countValidSelections(int[] nums) {
    
        int n = nums.length;
        if (n == 1 && nums[0] == 0) return 2;

        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) prefix[i] = prefix[i - 1] + nums[i];

        int totalSum = prefix[n - 1];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                int leftSum = (i == 0) ? 0 : prefix[i - 1];
                int rightSum = (i == n - 1) ? 0 : totalSum - prefix[i];

                int diff = Math.abs(leftSum - rightSum);
                if (diff == 0) count += 2;
                else if (diff == 1) count += 1;
            }
        }

        return count;
    }
}

// if (nums[0] == 0 && nums.length == 1)
//     return 2;
// int leftSum = 0, rightSum = 0;
// int count = 0;
// // prefix sum 
// int prefix[] = new int[nums.length];
// prefix[0] = nums[0];
// for (int i = 1; i < nums.length; ++i) {
//     prefix[i] = nums[i] + prefix[i - 1];
// }
// int end = nums.length - 1;
// for (int i = 0; i < nums.length; ++i) {
//     if (i == 0 && nums[i] == 0) {
//         leftSum = 0;
//         rightSum = prefix[end] - prefix[i];
//         if (leftSum == rightSum)
//             count = count + 2;
//         else if (Math.abs(leftSum - rightSum) == 1)
//             count = count + 1;
//     } else if (i == end && nums[i] == 0) {
//         leftSum = prefix[end - 1];
//         rightSum = 0;
//         if (leftSum == rightSum)
//             count = count + 2;
//         else if (Math.abs(leftSum - rightSum) == 1)
//             count = count + 1;
//     } else if (nums[i] == 0) {
//         leftSum = prefix[i - 1];
//         rightSum = prefix[end] - prefix[i];
//         if (leftSum == rightSum)
//             count = count + 2;
//         else if (Math.abs(leftSum - rightSum) == 1)
//             count = count + 1;
//     }
// }
// return count;
}}