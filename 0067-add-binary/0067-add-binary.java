class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        StringBuilder carry = new StringBuilder("0");

        int lenA = a.length();
        int lenB = b.length();

        int i = lenA - 1;
        int j = lenB - 1;
        while (i >= 0 && j >= 0) {
            char c = carry.charAt(0);
            char currA = a.charAt(i);
            char currB = b.charAt(j);
            if ((currA == '0' && currB == '0') && c == '0') {
                res.insert(0, "0");
                carry.setCharAt(0, '0');
            } else if ((currA == '0' && currB == '0') && c == '1') {
                res.insert(0, "1");
                carry.setCharAt(0, '0');
            } else if ((currA == '1' && currB == '0') && c == '0') {
                res.insert(0, "1");
                carry.setCharAt(0, '0');
            } else if ((currA == '0' && currB == '1') && c == '0') {
                res.insert(0, "1");
                carry.setCharAt(0, '0');
            } else if ((currA == '1' && currB == '0') && c == '1') {
                res.insert(0, "0");
                carry.setCharAt(0, '1');
            } else if ((currA == '0' && currB == '1') && c == '1') {
                res.insert(0, "0");
                carry.setCharAt(0, '1');
            } else if ((currA == '1' && currB == '0') && c == '1') {
                res.insert(0, "0");
                carry.setCharAt(0, '1');
            } else if ((currA == '1' && currB == '1') && c == '0') {
                res.insert(0, "0");
                carry.setCharAt(0, '1');
            } else if ((currA == '1' && currB == '1') && c == '1') {
                res.insert(0, "1");
                carry.setCharAt(0, '1');
            }
            i--;
            j--;
        }
        while (i >= 0) {
            char c = carry.charAt(0);
            char currA = a.charAt(i);
            if (currA == '0' && c == '0') {
                res.insert(0, "0");
                carry.setCharAt(0, '0');
            } else if (currA == '0' && c == '1') {
                res.insert(0, "1");
                carry.setCharAt(0, '0');
            } else if (currA == '1' && c == '0') {
                res.insert(0, "1");
                carry.setCharAt(0, '0');
            } else if (currA == '1' && c == '1') {
                res.insert(0, "0");
                carry.setCharAt(0, '1');
            }
            i--;
        }
        while (j >= 0) {
            char c = carry.charAt(0);
            char currB = b.charAt(j);
            if (currB == '0' && c == '0') {
                res.insert(0, "0");
                carry.setCharAt(0, '0');
            } else if (currB == '0' && c == '1') {
                res.insert(0, "1");
                carry.setCharAt(0, '0');
            } else if (currB == '1' && c == '0') {
                res.insert(0, "1");
                carry.setCharAt(0, '0');
            } else if (currB == '1' && c == '1') {
                res.insert(0, "0");
                carry.setCharAt(0, '1');
            }
            j--;
        }
        if (carry.charAt(0) == '1')
            res.insert(0, "1");

        return res.toString();
    }
}