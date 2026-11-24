class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        Arrays.sort(nums);
        int ans = -1;
        int prevCloset = Integer.MAX_VALUE;

        for (int i = 0; i < len - 2; i++) {
            int l = i + 1;
            int r = len - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                int diff = Math.abs(target - sum);
                if (diff < prevCloset) {
                    ans = sum;
                    prevCloset = diff;
                }
                if (sum < target)
                    l++;
                else if (sum > target)
                    r--;
                else
                    return sum;
            }
        }
        return ans;
    }
}