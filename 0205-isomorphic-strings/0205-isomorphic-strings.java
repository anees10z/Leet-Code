class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); ++i) {
            char tempS = s.charAt(i);
            char tempT = t.charAt(i);
            if (map.containsKey(tempS)) {
                if (map.get(tempS) != tempT) {
                    return false;
                }
            }
            map.put(tempS, tempT);
        }
        map.clear();
        for (int i = 0; i < s.length(); ++i) {
            char tempS = s.charAt(i);
            char tempT = t.charAt(i);
            if (map.containsKey(tempT)) {
                if (map.get(tempT) != tempS) {
                    return false;
                }
            }
            map.put(tempT, tempS);
        }

        return true;
    }
}