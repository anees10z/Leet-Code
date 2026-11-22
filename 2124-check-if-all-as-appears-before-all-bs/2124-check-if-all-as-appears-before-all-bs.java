class Solution {
    public boolean checkString(String s) {
        boolean bFound = false;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            char curr = s.charAt(i);
            if (curr == 'b') {
                bFound = true;
            }

            if (bFound && curr == 'a')
                return false;
        }
        return true;
    }
}