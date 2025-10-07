class Solution {
    public int removeDuplicates(int[] nums) {
         // if empty or single-element case
        if (nums.length <= 1) {
            return nums.length;
        }

        // pointer for the position to place the next unique element
        int k = 0;
        // Store the current unique element for comparison
        int temp = nums[0]; 

        // Iterate through the second element
        for (int i = 1; i < nums.length; ++i) {
            // Check if the current element is different from the last unique element
            if (nums[i] != temp) { // if true then
                // Increment k and place the new unique element at position k
                nums[++k] = nums[i];
                // Update temp to the new unique element
                temp = nums[i];
            }
        }
        // Return the length of the array with duplicates removed
        return k + 1;
    }
}
