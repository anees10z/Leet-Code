class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for (int item : nums) {
            set.add(item);
        }
        for (int i = 1; true; i++) {
            if (!set.contains(i)) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}