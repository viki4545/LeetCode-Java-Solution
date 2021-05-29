class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        //determine the low and high of the array
        int low = 0;
        int high = letters.length;
        //loop will work till low index is smaller than higher index
        while(low<high){
            //finding mid
            int mid = low + (high - low)/2;
            //check the condition if mid is greater than the target then high = mid or else low=mid + 1
            if(letters[mid] > target){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        //loop back around find the next element
        return letters[low%letters.length];
        
    }
}