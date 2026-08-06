class Solution {
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
        // also done using while loop (n>0)
        // perform And(1) with last bit and incerement count
    }
}