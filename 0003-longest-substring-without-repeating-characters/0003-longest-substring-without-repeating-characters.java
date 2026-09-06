class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        int res = 0;
        int index = 0;
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                res = Math.max(res, count);
                while (set.contains(ch)) {
                    set.remove(s.charAt(index++));
                    count--;
                }
                set.add(ch);
                count++;
            } else {
                set.add(ch);
                count++;
            }
        }
        return Math.max(res, count);
    }
}