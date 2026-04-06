class Solution {
    public String reverseOnlyLetters(String s) {
        int l = 0, r = s.length() - 1;
        char[] arr = s.toCharArray();
        while (l < r) {
            int Lascii = arr[l];
            int Rascii = arr[r];
            if (Lascii < 65 || Lascii > 90 && Lascii < 97 || Lascii > 122) {
                l++;
                continue;
            }
            if (Rascii < 65 || Rascii > 90 && Rascii < 97 || Rascii > 122) {
                r--;
                continue;
            }
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return (new String(arr));
    }
}