class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char curr = sb.charAt(0);
            sb.delete(0, 1);
            sb.append(curr);
            if (sb.toString().equals(goal))
                return true;
        }
        return false;
    }
}