class Solution {
    public char repeatedCharacter(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); ++i) {
            char curr = s.charAt(i);
            freq[curr - 'a']++;
            if (freq[curr - 'a'] == 2) {
                return curr;
            }
        }
        return ' ';
    }
}