class Solution {
    public String addBinary(String a, String b) {
        
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        while(i>=0 || j>=0){
            if(i>=0){
                carry = carry + a.charAt(i--) - '0';
            }
            if(j>=0){
                carry = carry + b.charAt(j--) - '0';
            }
            sb.append(carry%2);
            carry = carry/2;
        }
        
        if(carry > 0){
            sb.append(carry);
        } 
        
        return sb.reverse().toString();
    }
}