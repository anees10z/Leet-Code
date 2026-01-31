class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int targetCode = (int) target;
        for (int i = 0; i < letters.length; ++i) {
            int currCharCode = (int) letters[i];
            if(currCharCode > targetCode){
                return letters[i];
            }
        }
        return letters[0];
    }
}