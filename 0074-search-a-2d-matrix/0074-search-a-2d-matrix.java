class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0)
            return false;
        int row = matrix.length;
        int col = matrix[0].length;

        int l = 0;
        int h = row * col - 1;
        int n = col;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            int r = mid / n;
            int c = mid % n;
            int curr = matrix[r][c];
            if (curr == target)
                return true;
            else if (target > curr) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return false;
    }
}
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int row = 0;
//         int col = matrix[0].length - 1;
//         int len = matrix.length;

//         while (row < len && col >= 0) {
//             int curr = matrix[row][col];
//             if (curr == target)
//                 return true;
//             else if (target > curr) {
//                 row++;
//             } else {
//                 col--;
//             }
//         }
//         return false;
//     }
// }