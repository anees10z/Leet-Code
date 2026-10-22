class Solution {
    public int subarraySum(int[] nums, int k) { // TC - O(n)
        int count = 0;
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] prefix = new int[len];
        prefix[0] = nums[0];

        for (int i = 1; i < len; ++i) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < len; i++) {
            if (prefix[i] == k)
                count++;
            int prefixSum = prefix[i] - k;
            if (map.containsKey(prefixSum)) {
                count += map.get(prefixSum);
            }
            map.put(prefix[i], map.getOrDefault(prefix[i], 0) + 1);
        }
        return count;
    }
}
// class Solution {
//     // optimize with hash map
//     public int subarraySum(int[] nums, int k) { // TC - O(n^2)
//         int count = 0;
//         int len = nums.length;
//         for (int i = 1; i < len; ++i) {
//             nums[i] += nums[i - 1];
//         }

//         for (int start = 0; start < len; start++) {
//             for (int end = start; end < len; end++) {
//                 if (start == 0) {
//                     if (nums[end] == k)
//                         count++;
//                 } else {
//                     if ((nums[end] - nums[start - 1]) == k)
//                         count++;
//                 }
//             }
//         }
//         return count;
//     }
// }