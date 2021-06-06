class Solution {
    public int romanToInt(String s) {
        
        int result = 0;
        //check if string is not null
        if(s != null){
            //traverse the loop from i -> 0 to secondlast index
            for(int i = 0; i<=s.length()-2 ;i++){
                //check if i > i+1
                if(getVal(s.charAt(i)) >= getVal(s.charAt(i+1))){
                    //then result = result + i;
                    result += getVal(s.charAt(i));
                //check if i < i+1;
                }else{
                    //then result = result - i;
                    result -= getVal(s.charAt(i));
                
                }
            }
                //return the output
              result += getVal(s.charAt(s.length()-1)); 
        }
     return result;   
    }
        
        
        private int getVal(char c){
            switch(c){
                case 'I':
                    return 1;
                case 'V':
                    return 5;
                case 'X':
                    return 10;
                case 'L':
                    return 50;
                case 'C':
                    return 100;
                case 'D':
                    return 500;
                case 'M':
                    return 1000;
                default:
                    return 0;
            }
    }
}