class Solution {
    public int tribonacci(int n) {

        int[] f = new int[n + 1];

        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        f[0] = 0;
        f[1] = 1;
        f[2] = 1;

        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2] + f[i - 3];
        }

        return f[n];
    }
}

// class Solution {
//     public int tribonacci(int n) {
//         int[] f = new int[3+n];
//         f[0] = 0;
//         f[1] = 1;
//         f[2] = 1;
//         for (int i = 0; i < n; i++)
//             f[i + 3] = f[i] + f[i + 1] + f[i + 2];
//         return f[n];
//     }
// }