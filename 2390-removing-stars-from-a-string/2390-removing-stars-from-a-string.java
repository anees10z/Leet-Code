class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char curr = sb.charAt(i);
            if (curr == '*') {
                sb.delete(i - 1, i + 1);
                i -= 2;
            }
        }
        return sb.toString();
    }
}