class Solution {
    public int minChanges(String s) {
        int len = s.length();
        int count = 0;
        for (int i = 1; i < len; i += 2) {
            char curr1 = s.charAt(i);
            char curr2 = s.charAt(i - 1);
            if (curr1 != curr2)
                count++;
        }
        return count;
    }
}

// class Solution {
//     public int minChanges(String s) {
//         int len = s.length();
//         int count = 0;
//         int i = 0;
//         int j = 1;
//         while (i < len) {
//             char curr1 = s.charAt(i);
//             char curr2 = s.charAt(j);
//             if (curr1 != curr2) {
//                 count++;
//             }
//             i += 2;
//             j += 2;
//         }
//         return count;
//     }
// }