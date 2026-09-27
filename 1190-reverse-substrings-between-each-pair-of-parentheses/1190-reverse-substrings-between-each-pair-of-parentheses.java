class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char curr = s.charAt(i);
            if (curr == ')') {
                while (st.peek() != '(') {
                    res.append(st.pop());
                }
                st.pop();
                if (!st.empty() || i!=len) {
                    for (int j = 0; j < res.length(); j++) {
                        st.push(res.charAt(j));
                    }
                    res.setLength(0);
                }
            } else {
                st.push(curr);
            }
        }
        if (!st.empty()) {
            while (!st.empty()) {
                res.append(st.pop());
            }
            return res.reverse().toString();
        }
        return res.toString();
    }
}