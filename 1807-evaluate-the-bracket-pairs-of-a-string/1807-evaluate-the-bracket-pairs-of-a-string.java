class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> keys = new HashMap<>();
        StringBuilder res = new StringBuilder("");
        int len = s.length();
        int sIdx = -1;
        int eIdx = -1;
        for (int i = 0; i < knowledge.size(); ++i) {
            String key = knowledge.get(i).get(0);
            String value = knowledge.get(i).get(1);
            keys.put(key, value);
        }

        for (int i = 0; i < len; ++i) {
            char ch = s.charAt(i);
            if (ch == '(') {
                sIdx = i;
                while (ch != ')') {
                    ++i;
                    ch = s.charAt(i);
                }
                eIdx = i;
                String key = s.substring(sIdx + 1, eIdx);
                if (keys.containsKey(key)) {
                    res.append(keys.get(key));
                } else {
                    res.append('?');
                }
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }
}