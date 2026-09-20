class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int len = s.length();
        for (int i = 0; i < len; ++i) {
            char curr = s.charAt(i);
            int revIdx = 26 - (curr - 'a');
            sum = sum + ((i + 1) * revIdx);
        }
        return sum;
    }
}