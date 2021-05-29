class Solution {
    public int reverse(int x) {
        int reverse = 0;
        while(x != 0){
            if(Math.abs(reverse)>Integer.MAX_VALUE/10)return 0;
            int remainder = x%10;
            reverse = reverse*10+remainder;
            x = x/10;
        }
        return reverse;
        
    }
}