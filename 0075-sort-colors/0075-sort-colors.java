class Solution {
    public void sortColors(int[] nums) {
        if (nums.length == 1)
            return;
        int[] freq = new int[3];
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            freq[nums[i]]++;
        }
        int len = freq.length;
        int k = 0;
        for (int i = 0; i < len; ++i) {
            while (freq[i] != 0) {
                nums[k++] = i;
                freq[i]--;
            }
        }
    }
}