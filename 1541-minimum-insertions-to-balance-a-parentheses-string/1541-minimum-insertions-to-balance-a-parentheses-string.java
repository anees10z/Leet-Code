class Solution {
    public int minInsertions(String s) {
        Stack<Character> st = new Stack<>();
        int len = s.length();
        int ans = 0;

        for (int i = 0; i < len; i++) {
            char curr = s.charAt(i);
            if (curr == '(')
                st.push(curr);
            if (curr == ')') {
                if (i + 1 < len && s.charAt(i + 1) == ')') {
                    if (!st.isEmpty()) {
                        st.pop();
                        i++;
                    }else{
                        ans+=1;
                        i++;
                    }
                } else {
                    ans += 1;
                    if (st.isEmpty())
                        ans += 1;
                    else
                        st.pop();
                }
            }
        }
        if (!st.isEmpty()) {
            ans += st.size() * 2;
        }
        return ans;
    }
}
