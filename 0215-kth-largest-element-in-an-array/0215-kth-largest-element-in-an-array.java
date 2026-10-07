class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int len = nums.length;
        for (int num : nums) {
            pq.add(num);
        }
        for (int i = 0; i < len - k; i++) {
            pq.remove();
        }
        return pq.peek();
    }
}
// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         // optimize using QuickSelect Algorithm
//         Arrays.sort(nums);
//         return nums[nums.length - k];
//     }
// }