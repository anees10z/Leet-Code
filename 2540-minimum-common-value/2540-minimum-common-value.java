class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int res = Integer.MAX_VALUE;
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if(res > nums1[i]) res = nums1[i];
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j])
                i++;
            else
                j++;
        }
        if (res == Integer.MAX_VALUE)
            return -1;
        return res;
    }
}