class Solution {
    public void duplicateZeros(int[] arr) {
        int i;
        int n = arr.length;
        //take the another array for storing the resultant array value
        int[] res = new int[n];
        //start of the array
        int index = 0;
        //this for loop for traversing the array
        for(i = 0; i < n; i++){
            //check if the the index value of the array is not equal to zero then put the same value at the index
            if(arr[index] != 0){
                res[i] = arr[index];
            }else{
                //or if arr[index] == 0 then put the arr[index] = res[i] and res[i + 1] = 0 
                res[i] = 0;
                if(i + 1 < n){
                    res[i + 1] = 0;
                     i = i + 1;
                }
            }
             index++; 
        }
        //this loop is for replace the value of original array(arr[i]) by resultant array (res[i])
        for(i = 0;i<n;i++){
            arr[i] = res[i];
        }
    }
}