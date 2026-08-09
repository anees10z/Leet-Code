class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int  i =0; i< Math.pow(2,n); i++){
            int res = 0;
            int idx = 0;
            int temp = i;
            while(temp>0){
                if((temp & 1) == 1){
                    res = res^nums[idx];
                }
                idx++;
                temp = temp>>1;
            }
            sum+=res;
        }
        return sum;
    }
}