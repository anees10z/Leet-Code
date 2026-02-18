class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev = -1;
        boolean res = true;
        while (n > 0) {
            int curr = 0;
            if ((n & 1) == 0) {
                curr = 0;
            } else {
                curr = 1;
            }

            if(prev == curr){
                res = false;
                break;
            }else{
                prev = curr;
            }

            n = n >> 1;
        }
        return res;
    }
}