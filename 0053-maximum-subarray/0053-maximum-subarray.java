class Solution {
    public static int max(int[] num){
        int max = Integer.MIN_VALUE;
        for(int i : num){
            if(i>max) max = i;
        }
        return max;
    }
    public int maxSubArray(int[] nums) { // Using Kadane's Algorithm
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i : nums){
            currSum+=i;
            if(currSum<0) currSum=0;
            maxSum = Math.max(currSum, maxSum);
        }
        if(maxSum==0) return max(nums);
        else return maxSum;

    }
}