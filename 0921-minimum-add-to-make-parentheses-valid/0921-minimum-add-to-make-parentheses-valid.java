class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        int minMoves = 0;

        for (char ch : s.toCharArray()) {
            if (ch == ')' && st.isEmpty())
                minMoves++;
            else if (ch == ')' && st.peek() == '(')
                st.pop();
            else
                st.push(ch);
        }

        while (!st.isEmpty()) {
            minMoves++;
            st.pop();
        }

        return minMoves;
    }
}