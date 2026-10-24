class Solution {
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0);
    }

    public static int countDays(String date) {
        int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int year = (date.charAt(0) - '0') * 1000 + (date.charAt(1) - '0') * 100 + (date.charAt(2) - '0') * 10
                + (date.charAt(3) - '0');
        int month = (date.charAt(5) - '0') * 10 + (date.charAt(6) - '0') - 1;
        int days = (date.charAt(8) - '0') * 10 + (date.charAt(9) - '0');
        int res = days;
        for (int i = month - 1; i >= 0; i--) {
            res += months[i];
            if (i == 1 && isLeapYear(year))
                res += 1;
        }
        for (int i = year - 1; i >= 1971; i--) {
            res += 365;
            if (isLeapYear(i))
                res += 1;
        }
        return res;
    }

    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(countDays(date1) - countDays(date2));
    }
}