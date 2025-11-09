class Solution {
    public int countOperations(int num1, int num2) {
        int opCount = 0;
        // optimized with divide + modulo-> O(log(min(num1, num2)))
        while (num1 != 0 && num2 != 0) {
            if (num1 >= num2) {
                opCount += num1 / num2;
                num1 %= num2;
            } else {
                opCount += num2 / num1;
                num2 %= num1;
            }
        }
        return opCount;
        // Repeated subtraction -->  O(max(num1, num2))
        /*while(num1 != 0 && num2 != 0){
            if(num1>=num2){
                num1-=num2;
            }else{
                num2-=num1;
            }
            opCount++;
        }
        return opCount; */
    }
}