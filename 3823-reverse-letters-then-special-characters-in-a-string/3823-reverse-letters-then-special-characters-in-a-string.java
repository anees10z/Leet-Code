class Solution {
    public String reverseByType(String s) {
        StringBuilder sb = new StringBuilder(s);
        int len = sb.length();
        if (len == 1)
            return s;

        // Pass-1: reverse letters 
        int l = 0;
        int r = len - 1;
        while (l <= r) {
            char currLeft = sb.charAt(l);
            char currRight = sb.charAt(r);

            boolean leftIsLetter = (currLeft >= 'a' && currLeft <= 'z');
            boolean rightIsLetter = (currRight >= 'a' && currRight <= 'z');

            if (leftIsLetter && rightIsLetter) {
                // swap
                sb.setCharAt(l, currRight);
                sb.setCharAt(r, currLeft);
                l++;
                r--;
            } else if (!leftIsLetter) {
                l++;
            } else {
                r--;
            }
        }
        // Pass-2: reverse specialChars
        l = 0;
        r = len - 1;
        while (l <= r) {
            char currLeft = sb.charAt(l);
            char currRight = sb.charAt(r);

            boolean leftIsLetter = (currLeft >= 'a' && currLeft <= 'z');
            boolean rightIsLetter = (currRight >= 'a' && currRight <= 'z');

            if (!leftIsLetter && !rightIsLetter) {
                // swap
                sb.setCharAt(l, currRight);
                sb.setCharAt(r, currLeft);
                l++;
                r--;
            } else if (leftIsLetter) {
                l++;
            } else {
                r--;
            }
        }
        return sb.toString();
    }
}
// class Solution {
//     public String reverseByType(String s) {
//         StringBuilder sb = new StringBuilder(s);
//         int len = sb.length();
//         if (len == 1)
//             return s;

//         // Pass-1: reverse letters 
//         int l = 0;
//         int r = len - 1;
//         while (l <= r) {
//             char currLeft = sb.charAt(l);
//             char currRight = sb.charAt(r);

//             if ((currLeft >= 'a' && currLeft <= 'z') && (currRight >= 'a' && currRight <= 'z')) {
//                 sb.setCharAt(l, currRight);
//                 sb.setCharAt(r, currLeft);
//                 l++;
//                 r--;
//             } else if (!(currLeft >= 'a' && currLeft <= 'z')) {
//                 l++;
//             } else if (!(currRight >= 'a' && currRight <= 'z')) {
//                 r--;
//             }
//         }
//         // Pass-2: reverse specialChars
//         l = 0;
//         r = len - 1;
//         while (l <= r) {
//             char currLeft = sb.charAt(l);
//             char currRight = sb.charAt(r);

//             if (!(currLeft >= 'a' && currLeft <= 'z') && !(currRight >= 'a' && currRight <= 'z')) {
//                 sb.setCharAt(l, currRight);
//                 sb.setCharAt(r, currLeft);
//                 l++;
//                 r--;
//             } else if ((currLeft >= 'a' && currLeft <= 'z')) {
//                 l++;
//             } else if ((currRight >= 'a' && currRight <= 'z')) {
//                 r--;
//             }
//         }
//         return sb.toString();
//     }
// }