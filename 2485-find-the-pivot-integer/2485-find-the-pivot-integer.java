class Solution {
    public int pivotInteger(int n) {
        if(n==1) return 1;
        int leftSum = 0, rightSum = 0;
        // prefix sum in same array
        int nums[] = new int[n+1];
        for(int i = 0 ; i<=n;++i){
            nums[i] = i;
        }
        for (int i = 2; i < nums.length; ++i) {
            nums[i] = nums[i] + nums[i - 1];
        }
        int end = nums.length - 1;
        for (int i = 2; i < nums.length; ++i) {
            // if (i == 1) {
            //     leftSum = num;
            //     rightSum = nums[end] - nums[i];
            // } else if (i == end) {
            //     rightSum = 0;
            //     leftSum = nums[end - 1];
            // } else {
                leftSum = nums[i];
                rightSum = nums[end] - nums[i-1];
            // }
            if (leftSum == rightSum)
                return i;
        }
        return -1;
    }
}