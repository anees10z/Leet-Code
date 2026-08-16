class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Boolean> list = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (list.containsKey(nums[i])) {
                list.put(nums[i], true);
                continue;
            }
            list.put(nums[i], false);
        }
        for (int i = 0; i < nums.length; ++i) {
            int curr = nums[i];
            if (list.containsKey(curr + 1) || list.containsKey(curr - 1) || (list.containsKey(curr) && list.get(curr)== true))
                continue;
            res.add(nums[i]);
        }
        return res;
    }
}