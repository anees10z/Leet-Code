class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        int l = 0;
        boolean isChar = false;

        for (int i = 0; i < len; i++) {
            char curr = s.charAt(i);
            if (curr == ' ') {
                if (isChar) {
                    if (sb.length() > 0)
                        sb.insert(0, ' ');
                    sb.insert(0, s.substring(l, i));
                    isChar = false;
                }
            } else {
                if (!isChar) {
                    l = i;
                    isChar = true;
                }
            }

        }
        if (isChar) {
            if (sb.length() > 0)
                sb.insert(0, ' ');
            sb.insert(0, s.substring(l, len));
        }
        return sb.toString();
    }
}
