class Solution {
    public int smallestNumber(int n) {
        int x=0;

        for(int i=1;i<=n;++i){
            x=(int)Math.pow(2,i)-1;
            if(x>=n){
                break;
            }
        }
        return x;
    }
}