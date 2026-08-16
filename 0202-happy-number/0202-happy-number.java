import java.util.HashMap;

class Solution {
    public static int squareNum(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + (rem * rem);
            n = n / 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        HashMap<Integer, Boolean> list = new HashMap<>();
        while (n != 1) {
            n = squareNum(n);
            if (list.containsKey(n)) {
                return false;
            }
            list.put(n, false);
        }
        return true;
    }
}