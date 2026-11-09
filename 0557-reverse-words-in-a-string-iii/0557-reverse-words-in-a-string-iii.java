class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        int l = 0;

        for (int i = 0; i < len; i++) {
            char curr = s.charAt(i);
            if (curr == ' ') {
                for (int k = i - 1; k >= l; k--) {
                    sb.append(s.charAt(k));
                }
                sb.append(' ');
                l = i + 1;
            }
        }
        for (int k = len - 1; k >= l; k--) {
            sb.append(s.charAt(k));
        }
        return sb.toString();
    }
}
// class Solution {
//     public String reverseWords(String s) {
//         StringBuilder sb = new StringBuilder();
//         int len = s.length();
//         int l = 0;
//         int r = len;

//         for (int i = 0; i < len; i++) {
//             char curr = s.charAt(i);
//             if (curr == ' ') {
//                 r = i;
//                 sb.append(new StringBuilder(s.substring(l, r)).reverse().toString());
//                 sb.append(' ');
//                 l = i + 1;
//             }
//         }
//         r = len;
//         sb.append(new StringBuilder(s.substring(l, r)).reverse().toString());
//         return sb.toString();
//     }
// }