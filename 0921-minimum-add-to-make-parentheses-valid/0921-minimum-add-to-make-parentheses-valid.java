class Solution {
    public int minAddToMakeValid(String s) {
        int minMoves = 0;
        int openCount = 0;
        int closeCount = 0;
        for (char ch : s.toCharArray()) {
            if (ch == ')')
                closeCount++;
            else
                openCount++;
            if (closeCount > 0 && openCount == 0) {
                minMoves++;
                closeCount = 0;
            } else if (closeCount == openCount) {
                closeCount = openCount = 0;
            }else if(openCount>closeCount){
                openCount = openCount - closeCount;
                closeCount = 0;
            }
        }

        return minMoves + openCount;
    }
}
// class Solution {
//     public int minAddToMakeValid(String s) {
//         Deque<Character> st = new ArrayDeque<>();
//         int minMoves = 0;

//         for (char ch : s.toCharArray()) {
//             if (ch == ')' && st.isEmpty())
//                 minMoves++;
//             else if (ch == ')' && st.peek() == '(')
//                 st.pop();
//             else
//                 st.push(ch);
//         }

//         while (!st.isEmpty()) {
//             minMoves++;
//             st.pop();
//         }

//         return minMoves;
//     }
// }