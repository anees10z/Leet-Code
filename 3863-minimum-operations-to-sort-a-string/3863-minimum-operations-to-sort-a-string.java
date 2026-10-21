class Solution {
    public int minOperations(String s) {
        int len = s.length();
        boolean isSorted = true;
        for (int i = 1; i < len; i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                isSorted = false;
                break;
            }
        }
        if (isSorted)
            return 0;
        if (len == 2)
            return -1;
        char mn = s.charAt(0);
        char mx = s.charAt(0);
        for (int i = 0; i < len; i++) {
            char curr = s.charAt(i);
            if (curr < mn)
                mn = curr;
            if (curr > mx)
                mx = curr;
        }
        if (s.charAt(0) == mn || s.charAt(len - 1) == mx)
            return 1;
        for (int i = 1; i < len - 1; i++) {
            char curr = s.charAt(i);
            if (curr == mn || curr == mx)
                return 2;
        }
        return 3;
    }
}