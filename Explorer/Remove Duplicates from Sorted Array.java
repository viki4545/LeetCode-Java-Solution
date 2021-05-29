class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        if(n==0)return 0;
        int start = 0;
        for(i = 0;i<n-1;i++){
            if(nums[i] != nums[i+1]){
                nums[start] = nums[i];
                start++;
            }
        }
        nums[start] = nums[n-1];
        return start+1;
    }
    
}