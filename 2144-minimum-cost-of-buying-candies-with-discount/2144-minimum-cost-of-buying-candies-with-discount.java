class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int minCost = 0;
        if (cost.length < 3) {
            for (int i = 0; i < cost.length; i++) {
                minCost += cost[i];
            }
            return minCost;
        }
        int skip = 0;
        for (int i = cost.length-1; i>=0 ; i--) {
            minCost += cost[i];
            skip++;
            if (skip == 2) {
                skip = 0;
                i--;
            }
        }
        return minCost;
    }
}