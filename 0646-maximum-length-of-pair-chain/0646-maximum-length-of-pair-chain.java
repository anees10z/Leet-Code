class Solution {
    public int findLongestChain(int[][] pairs) {
        int chainLen = 0;
        int len = pairs.length;
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));

        chainLen = 1;
        int chainLast = pairs[0][1];

        for (int i = 1; i<len;i++){
            if(chainLast<pairs[i][0]){
                chainLen++;
                chainLast = pairs[i][1];
            }
        }
        return chainLen;
    }
}