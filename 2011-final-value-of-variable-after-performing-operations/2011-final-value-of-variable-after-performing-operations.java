class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        // for(int i =0; i<operations.length;++i){
        //     if(operations[i].equals("++X") || operations[i].equals("X++"))
        //         x++;
        //     else if(operations[i].equals("--X") || operations[i].equals("X--"))
        //         x--;
        // }
        // optimized
        for (String op : operations) {
            // Only check middle character
            if (op.charAt(1) == '+') x++;
            else x--;
        }
        return x;
    }
}