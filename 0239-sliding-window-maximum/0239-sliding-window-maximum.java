class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 1)
            return nums;
        int len = nums.length;
        int[] res = new int[len - k + 1]; // No. of windows
        int resIdx = -1;
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < len; ++i) {
            if (dq.isEmpty()) {
                dq.addLast(i);
                continue;
            }

            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            if (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                    dq.removeLast();
                }
                dq.addLast(i);
            } else {
                dq.addLast(i);
            }
            if (i >= k - 1) {
                res[++resIdx] = nums[dq.peekFirst()];
            }
        }
        return res;
    }
}
// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         if (k == 1)
//             return nums;
//         List<Integer> list = new ArrayList<>();
//         int len = nums.length;
//         int max = Integer.MIN_VALUE;

//         for (int i = 0; i < k; ++i) {
//             max = Math.max(max, nums[i]);
//         }
//         list.add(max);
//         for (int i = k; i < len; ++i) {
//             if (nums[i] > max)
//                 max = Math.max(max, nums[i]);
//             list.add(max);
//         }
//         int[] res = new int[list.size()];
//         for (int i = 0; i < list.size(); i++)
//             res[i] = list.get(i);
//         return res;
//     }
// }