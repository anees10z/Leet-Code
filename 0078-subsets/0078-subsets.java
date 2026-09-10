class Solution {
    public static void find(int[] nums, List<List<Integer>> res, int idx, List<Integer> curr) {
        if (idx == nums.length) {
            res.add(new ArrayList(curr));
            return;
        }
        curr.add(nums[idx]);
        find(nums, res, idx + 1, curr);
        curr.remove(curr.size() - 1);
        find(nums, res, idx + 1, curr);

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        find(nums, res, 0, curr);
        return res;
    }
}