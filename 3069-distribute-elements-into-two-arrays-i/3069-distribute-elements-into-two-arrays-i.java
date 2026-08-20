class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        int len = nums.length;
        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for (int i = 2; i < len; ++i) {
            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }
        int[] result = new int[len];
        int i = 0;
        for (int e1 : arr1) {
            result[i++] = e1;
        }
        for (int e2 : arr2) {
            result[i++] = e2;
        }

        return result;
    }
}