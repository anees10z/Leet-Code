class Solution {
    public int numberOfSpecialChars(String word) {
        int[] small = new int[26];
        int[] capital = new int[26];
        int count = 0;
        int len = word.length();
        for (int i = 0; i < len; i++) {
            char curr = word.charAt(i);
            if (curr >= 65 && curr <= 90) {
                capital[curr - 'A']++;
            } else {
                small[curr - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (small[i] > 0 && capital[i] > 0) {
                count++;
            }
        }
        return count;
    }
}