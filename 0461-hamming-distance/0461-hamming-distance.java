class Solution {
    public int hammingDistance(int x, int y) {
        int res = x^y;
        int ans = Integer.bitCount(res);
        return ans;
    }
}