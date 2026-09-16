class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs[0].length() == 0)
            return "";
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int commonIndex = 0;
        while (commonIndex < first.length() && commonIndex < last.length()) {
            if (first.charAt(commonIndex) == last.charAt(commonIndex)) {
                commonIndex++;
            } else {
                break;
            }
        }
        return first.substring(0, commonIndex);
    }
}