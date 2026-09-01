class Solution {

    public static boolean isAnagram(String curr, String str) {

        if (curr.length() != str.length())
            return false;

        int[] map = new int[26];

        for (int i = 0; i < curr.length(); ++i) {
            map[curr.charAt(i) - 'a']++;
            map[str.charAt(i) - 'a']--;
        }

        for (int c : map) {
            if (c != 0)
                return false;
        }

        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new ArrayList<>();

        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; ++i) {

            if (visited[i])
                continue;

            List<String> group = new ArrayList<>();

            String curr = strs[i];

            group.add(curr);
            visited[i] = true;

            for (int j = i + 1; j < strs.length; ++j) {

                if (visited[j])
                    continue;

                if (isAnagram(curr, strs[j])) {

                    group.add(strs[j]);
                    visited[j] = true;
                }
            }

            res.add(group);
        }

        return res;
    }
}