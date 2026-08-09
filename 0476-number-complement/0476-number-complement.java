class Solution {
    public int findComplement(int num) {
        int bitMask = 0;
        int temp = num;
        while(temp>0){
            bitMask = (bitMask<<1) | 1;
            temp = temp>>1;
        }
        return num ^ bitMask;
    }
}