class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sen1 = new StringBuilder("");
        StringBuilder sen2 = new StringBuilder("");
        for (int i = 0; i < word1.length; ++i) {
            sen1.append(word1[i]);
        }
        for (int i = 0; i < word2.length; ++i) {
            sen2.append(word2[i]);
        }
        return sen1.toString().equals(sen2.toString());
    }
}