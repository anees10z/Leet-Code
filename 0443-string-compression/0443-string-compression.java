class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int len = chars.length;
        int i = 0;
        while (i < len) {
            char curr = chars[i];
            int count = 0;
            while (i < len && curr == chars[i]) {
                i++;
                count++;
            }

            if (count > 1) {
                chars[index] = curr;
                if (count > 9) {
                    String num = Integer.toString(count);

                    for (int s = 0; s < num.length(); s++) {
                        index++;
                        chars[index] = num.charAt(s);
                    }
                } else {
                    index++;
                    chars[index] = (char) (count + '0');
                }

            }else{
                chars[index] = curr;
            }
            index++;
        }
        return index;
    }
}