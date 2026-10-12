class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            char curr = s.charAt(i);
            if (Character.isUpperCase(curr))
                sb.append((char) (curr + 32));
            else
                sb.append(curr);
        }
        return sb.toString();
    }
}