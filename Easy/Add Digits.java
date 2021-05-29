class Solution {
    public int addDigits(int num) {
        if(num < 10)return num;
        int newnum = 0;
        while(num > 0){
            newnum = newnum + num%10;
            num = num/10;
        }
        return newnum > 9 ? addDigits(newnum):newnum;
    }
}