class Solution {
    public String reversePrefix(String word, char ch) {
        int l = 0;
        int r = word.indexOf(ch);
        if(r == -1) return word;
        char[] str = word.toCharArray();
        while(l<r){
            char temp = str[l];
            str[l++] = str[r];
            str[r--] = temp;
        }
        return (new String(str));
    }
}