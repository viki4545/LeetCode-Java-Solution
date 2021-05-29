// by Mathematical method o(1)times

class Solution {
    public int arrangeCoins(int n) {
        //by formula for first n natural numbers
        //k(k+1)/2
        //k(k+1)/2 <= 2n
        //by completing square method
        return (int) (Math.sqrt(2*(long)n + 0.25) - 0.5);
    }
}