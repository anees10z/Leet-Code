class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        // int[] nextGreater = new int[len2];
        int[] res = new int[len1];

        for (int i = len2 - 1; i >= 0; i--) {
            int curr = nums2[i];
            while (!st.isEmpty() && st.peek() < curr) {
                st.pop();
            }
            if (st.isEmpty()) {
                // nextGreater[i] = -1;
                map.put(nums2[i], -1);
            } else {
                // nextGreater[i] = st.peek();
                map.put(nums2[i], st.peek());
            }
            st.push(curr);
        }
        // for (int i = 0; i < len2; i++) {
        //     map.put(nums2[i], nextGreater[i]);
        // }
        for (int i = 0; i < len1; i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}