class Solution {
    public int maxDepth(String s) {
        int len = s.length();
        int max = 0;
        int braceCount = 0;

        for(int i = 0; i < len; i++){
            char curr =  s.charAt(i);
            if(curr=='('){
                braceCount++;
                max = Math.max(max, braceCount);
            }else if(curr == ')'){
                braceCount--;
            }
        }
        return max;
    }
}