class Solution {
    public int minFlips(int a, int b, int c) {
        int count = 0;
        while (a != 0 || b != 0 || c != 0) {
            int bitA = a & 1;
            int bitB = b & 1;
            int bitC = c & 1;
            if ((bitA == 1 && bitB == 1) && bitC == 0)
                count += 2;
            else if ((bitA | bitB) != bitC)
                count++;
            a = a >> 1;
            b = b >> 1;
            c = c >> 1;
        }
        return count;
    }
}