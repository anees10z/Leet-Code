class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> keys = new HashMap<>();
        StringBuilder res = new StringBuilder();

        int len = s.length();

        for (int i = 0; i < knowledge.size(); i++) {
            keys.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                int startIdx = i;
                while (s.charAt(i) != ')') {
                    ++i;
                }
                int endIdx = i;

                String key = s.substring(startIdx + 1, endIdx);
                res.append(keys.getOrDefault(key, "?"));
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }
}