class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffle = new int[n * 2];
        for (int i = 0, j = n, k = 0; i < n; ++i, ++j) {
            shuffle[k++] = nums[i];
            shuffle[k++] = nums[j];
        }

        return shuffle;
    }
}