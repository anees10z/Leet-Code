class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int closeCount = 0;
        int openCount = 0;
        int openIdx = 0;
        int closeIdx = -1;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            char curr = s.charAt(i);
            if (curr == '(') {
                openCount++;
            } else {
                closeCount++;
            }

            if (openCount == closeCount) {
                closeIdx = i;
                res.append(s.substring(openIdx + 1, closeIdx));
                openIdx = i + 1;
                openCount = 0;
                closeCount = 0;
            }
        }

        return res.toString();
    }
}