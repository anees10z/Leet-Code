class Solution {
    public String largestOddNumber(String num) {
        int len = num.length();
        for (int i = len - 1; i >= 0; i--) {
            char curr = num.charAt(i);
            if ((curr - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}


// class Solution {
//     public String largestOddNumber(String num) {
//         boolean isOdd = false;
//         int len = num.length();
//         int lastOddIdx = len - 1;
//         for (int i = len - 1; i >= 0; i--) {
//             char curr = num.charAt(i);
//             if ((curr - '0') % 2 != 0) {
//                 isOdd = true;
//                 lastOddIdx = i;
//                 break;
//             }
//         }
//         if (!isOdd)
//             return "";
//         return num.substring(0, lastOddIdx + 1);
//     }
// }