class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;

        for (int i = 0; i < len; ++i) {
            int curr = nums[i];
            if (map.containsKey(curr)) {
                int j = map.get(curr);
                if (Math.abs(i - j) <= k) {
                    return true;
                }
            }
            map.put(curr, i);
        }

        return false;
    }
}