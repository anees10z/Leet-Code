class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        int res = -1;
        char resC = 'a';
        boolean ansExists = false;
        for (int i = 0; i < s.length(); ++i) {
            char curr = s.charAt(i);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }
        for (char key : map.keySet()) {
            if (map.get(key) == 1) {
                resC = key;
                ansExists = true;
                break;
            }
        }
        if (!ansExists) {
            return res;
        }

        for (int i = 0; i < s.length(); ++i) {
            char curr = s.charAt(i);
            if (curr == resC) {
                res = i;
                break;
            }
        }
        return res;
    }
}