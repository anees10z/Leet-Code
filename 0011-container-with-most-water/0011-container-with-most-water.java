class Solution {
    public int maxArea(int[] height) {
        int maxWater = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = Math.abs(left - right);
            maxWater = Math.max(maxWater, (h * w));
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxWater;
    }
}