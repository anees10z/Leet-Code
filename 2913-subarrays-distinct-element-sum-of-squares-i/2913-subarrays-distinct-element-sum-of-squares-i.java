class Solution {
    public int sumCounts(List<Integer> nums) {
        Set<Integer> set = new HashSet<>();
        int len = nums.size();
        int sum = 0;

        for (int i = 0; i < len; ++i) {
            for (int j = i; j < len; j++) {
                set.add(nums.get(j));
                int distinct = set.size();
                sum += distinct * distinct;
            }
            set.clear();

        }
        return sum;
    }
}