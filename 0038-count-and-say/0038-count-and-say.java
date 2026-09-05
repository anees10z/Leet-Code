class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String str = countAndSay(n - 1);
        int count = 0;
        char curr = str.charAt(0);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); ++i) {
            if(curr != str.charAt(i)){
                sb.append(String.valueOf(count));
                sb.append(curr);
                curr = str.charAt(i);
                count = 1;
            }else{
                count++;
            }
        }
        sb.append(String.valueOf(count));
        sb.append(curr);
        return sb.toString();
    }
}