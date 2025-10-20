class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int maxdrink = numBottles;
        int avail = numBottles;
        int exchanged;
        while (avail>= numExchange){
            exchanged = numBottles/numExchange;
            avail= numBottles%numExchange + exchanged;
            numBottles = avail;
            maxdrink+=exchanged;
        }
        return maxdrink;
    }
}