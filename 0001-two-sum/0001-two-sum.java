import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] res = new int[2];
        int l=0, r=l;
        while(l<nums.length-1){
            r++;
            if(nums[l]+nums[r]==target){
                res[0]=l;
                res[1]=r;
            }
            if(r==nums.length-1){
                l++;
                r=l;
            }
        }
        return res;
    }
}