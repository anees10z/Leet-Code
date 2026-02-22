class Solution {
    public int binaryGap(int n) {
        int l = -1, r = -1, max = Integer.MIN_VALUE, count = -1;
        while (n > 0) {
            int curr = (n & 1);
            if (curr == 0 && r == 1) {
                count++;
            } else if (curr == 1 && r == 1) {
                l = 1;
                count++;
                if (count >= max) {
                    max = count;
                    r = l;
                    count = 0;
                }
            } else if (curr == 1 && r != 1) {
                r = 1;
                count++;
            }
            n = n >> 1;
        }
        if(count>max) max=count;
        return max;
    }
}