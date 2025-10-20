class Solution {
    public int[] sums(int[] arr){
        int[] newArr= new int[arr.length-1];
        for(int i=0;i<arr.length-1;++i){
            newArr[i]= (arr[i]+arr[i+1])%10;
        }
        if(newArr.length==1) return newArr;
        return sums(newArr);
    }
    public int triangularSum(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] sum = sums(nums);
        return sum[0];
    }
}