class Solution {
    public String convertToTitle(int columnNumber) {
        
        //take variable of string to store string result
        StringBuilder sb = new StringBuilder();
        
        //iterate the loop till n is not equal to zero
        while(columnNumber != 0){
            
            //val = ((n-1)%26)
            int val = (columnNumber - 1) % 26;
            
            //(Ascii value of A(65) + val)
            sb.insert(0, (char)('A' + val));
            
            //n = (n-1)/26
            columnNumber= (columnNumber - 1)/26;
            
        }
        return sb.toString();
    }
}