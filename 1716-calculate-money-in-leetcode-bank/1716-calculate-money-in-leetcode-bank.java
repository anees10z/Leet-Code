class Solution {
    public int totalMoney(int n) {
        int sum = 0;

        int week = n / 7;
        int days = n % 7;
        int st = 0, en = 6;
        int temp = week;

        if (week == 0) {
            for (int i = st + 1; i <= days; ++i)
                sum += i;
            return sum;
        }

        while (week > 0) {
            st++;
            en++;
            for (int i = st; i <= en; ++i)
                sum += i;
            week--;
        }

        for (int i = st + 1; i <= days + temp; ++i)
            sum += i;

        return sum;
    }
}
