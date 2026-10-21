class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1.0;

        if (x == 0.0) {
            return (n < 0) ? Double.POSITIVE_INFINITY : 0.0;
        }

        long pow = n;
        boolean negExp = pow < 0;
        if (negExp) pow = -pow; // safe because pow is long

        double ans = 1.0;
        double base = x;

        while (pow > 0) {
            if ((pow & 1L) == 1L) ans *= base;
            base *= base;
            pow >>= 1;
        }

        return negExp ? 1.0 / ans : ans;
    }
}

// class Solution {
//     public double myPow(double x, int n) {
//         if (n == 0)
//             return 1.0;

//         if (x == 0.0) {
//             if (n < 0)
//                 return Double.POSITIVE_INFINITY; 
//             return 0.0;
//         }

//         long pow = n; // avoid overflow for n = Integer.MIN_VALUE
//         if (pow < 0) {
//             x = 1.0 / x;
//             pow = -pow;
//         }

//         double ans = 1.0;
//         while (pow > 0) {
//             if ((pow & 1) == 1)
//                 ans *= x;
//             x *= x;
//             pow >>= 1;
//         }
//         return ans;
//     }
// }

// class Solution {
//     public double myPow(double x, int n) {
//         if (n == 0)
//             return 1;
//         if (x == 0)
//             return 0;
//         long pow = n; // long because (n = -2147483648) overflow if n = -n
//         if (pow < 0) {
//             x = 1 / x;
//             pow = -pow;
//         }
//         double ans = 1;
//         // power treated in bit form ex: (n = 5 -> 101)
//         while (pow > 0) {
//             if ((pow & 1) == 1) {
//                 ans *= x;
//             }
//             x *= x; // next power range
//             pow = pow >> 1; // right shift 
//         }

//         return ans;
//     }

// }