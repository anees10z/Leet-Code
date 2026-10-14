class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int m = 0;
        int n = col - 1;
        while (m < row && n >= 0) {
            int curr = matrix[m][n];
            if (curr == target)
                return true;
            else if (curr < target)
                m++;
            else
                n--;
        }
        return false;
    }
}

// class Solution {
//     public static boolean binarySearch(int[][] matrix, int i, int low, int high, int target) {
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             int midVal = matrix[i][mid];

//             if (midVal == target)
//                 return true;
//             else if (midVal > target)
//                 high = mid - 1;
//             else
//                 low = mid + 1;
//         }
//         return false;
//     }

//     public boolean searchMatrix(int[][] matrix, int target) {
//         int row = matrix.length;
//         int col = matrix[0].length-1;

//         for (int i = 0; i < row; i++) {
//             if (binarySearch(matrix, i, 0, col, target))
//                 return true;
//         }
//         return false;
//     }
// }