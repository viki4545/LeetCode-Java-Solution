class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        if (arr[0] > arr[1]) return false;
        if (arr[arr.length - 2] < arr[arr.length - 1]) return false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) return false;
        }
        int upperSlope = 0;
        int lowerSlope = 0;
        
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i] < arr[i+1]) upperSlope++;
            if(arr[i] > arr[i+1]) break;
        }
        
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]) lowerSlope++;
        }
        
        return upperSlope + lowerSlope == arr.length-1;
    }
}