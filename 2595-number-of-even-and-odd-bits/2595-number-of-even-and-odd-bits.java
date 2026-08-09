class Solution {
    public int[] evenOddBit(int n) {
        int even = 0, odd = 0;
        int indice = 0;
        int arr[] = new int[2];
        while (n > 0) {
            if ((indice & 1) == 0 && (n & 1) == 1) {
                even++;
            } else {
                if ((n & 1) == 1)
                    odd++;
            }
            n = n >> 1;
            indice++;
        }
        arr[0] = even;
        arr[1] = odd;
        return arr;
    }
}