class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // Approach used -> Sliding Window
        for(int i = 1;i<nums.length;++i){
            if(nums[i]==0) continue;
            nums[i]= nums[i]+nums[i-1];
        }
        // Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;++i){
            if(nums[i]>max)
                max=nums[i];
        }
        // return nums[nums.length-1];
        return max;
    }
}