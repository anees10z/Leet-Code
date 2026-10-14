class Solution {
    public static boolean binarySearch(int[][] matrix, int i, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midVal = matrix[i][mid];
            if (midVal == target)
                return true;
            else if (midVal > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;

        for (int i = 0; i < row; i++) {
            if (binarySearch(matrix, i, 0, matrix[i].length - 1, target))
                return true;
        }
        return false;

    }
}