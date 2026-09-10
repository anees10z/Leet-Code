class Solution {
    public static void find(int[] nums, List<List<Integer>> res, int idx, List<Integer> curr) {
        if (idx == nums.length) {
            res.add(new ArrayList(curr));
            return;
        }
        curr.add(nums[idx]);
        find(nums, res, idx + 1, curr); // case add in set
        curr.remove(curr.size() - 1); // remove current added element from list
        find(nums, res, idx + 1, curr); //backtrack in case of not add in set

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        find(nums, res, 0, curr);
        return res;
    }
}