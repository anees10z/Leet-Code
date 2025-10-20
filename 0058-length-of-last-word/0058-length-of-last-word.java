class Solution {
    public int lengthOfLastWord(String s) {
        String[] res = s.split(" ");
        int index=res.length-1;
        return res[index].length();
    }
}