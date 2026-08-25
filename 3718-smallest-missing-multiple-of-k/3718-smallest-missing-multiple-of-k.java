class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int res = 0;
        for (int i = 0; i < nums.length; ++i) {
            set.add(nums[i]);
        }
        int i = 1;
        while (true) {
            int temp = k * i;
            if (!set.contains(temp)) {
                res = temp;
                break;
            }
            ++i;
        }
        return res;
    }
}