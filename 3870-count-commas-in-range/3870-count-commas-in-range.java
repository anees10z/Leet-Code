class Solution {
    public int countCommas(int n) {
        // int len = (int) Math.log10(n)+1;

        if(n<1000) return 0;

        return n-999;
    }
}