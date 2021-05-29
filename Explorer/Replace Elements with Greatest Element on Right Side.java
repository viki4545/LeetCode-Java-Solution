class Solution {
    public int[] replaceElements(int[] arr) {
        //n is the length of the array
        int n = arr.length;
        //we initialize maxVal is equal to -1 because we have to take last value in the array -1
        int maxVal= -1;
        //we will traverse the array from right to left
        for(int i = n-1;i>=0;i--){
                //temp = arr[i] = 1; arr[i] = maxVal = -1; maxVal = max(-1,1) = 1
                int temp = arr[i];
                arr[i] = maxVal;
                maxVal = Math.max(maxVal,temp);
        }
        return arr;
    }
}