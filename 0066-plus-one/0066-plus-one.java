class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i>=0; i--){
            if(digits[i]<9){ // if last element is less than 9 then increment it by 1 and return 
                digits[i]++;
                return digits;
            }
            digits[i]=0; // if not less than 9 means it is 9 then make this index value 0 and next 
                         // iteration the next element is increment by 1 and return
        }
        // if only one element = 9 present then this work
        int[] newDigit = new int[digits.length+1];
        newDigit[0] = 1;
        return newDigit;
    }
}