class Solution {
    public int trap(int[] height) {
         int maxWaterTrapped = 0;
        int[] leftMaxBar = new int[height.length];
        int[] rightMaxBar = new int[height.length];
        // left
        // {4,2,0,6,3,2,5};
        int lmax = height[0];
        leftMaxBar[0] = height[0];
        leftMaxBar[height.length - 1] = height[height.length - 1];

        for (int i = 1; i < height.length - 1; i++) {
            if (height[i] > lmax)
                lmax = height[i];
            leftMaxBar[i] = lmax;
        }
        // right
        int rmax = height[height.length - 1];
        rightMaxBar[0] = height[0];
        rightMaxBar[height.length - 1] = height[height.length - 1];

        for (int i = height.length - 2; i > 0; i--) {
            if (height[i] > rmax)
                rmax = height[i];
            rightMaxBar[i] = rmax;
        }

        // for (int i : rightMaxBar) {
        // System.out.print(i + " ");
        // }

        for (int i = 0; i < height.length; i++) {
            int trapAtEachBar = (Math.min(leftMaxBar[i], rightMaxBar[i]) - height[i]);
            maxWaterTrapped += trapAtEachBar;
        }
        return maxWaterTrapped;
    }
}