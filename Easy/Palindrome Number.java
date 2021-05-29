class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        boolean flag = false;
        int y = x;
        while(x != 0){
            if(x<0){
                flag = false;
                break;
            }
            int remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x/10;
        }
        if (y == reverse){ 
            flag = true;
        }
        else{
            
            flag = false;
        }
        return flag;
        
    }
}