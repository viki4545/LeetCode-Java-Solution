class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int evenIndex = 0;
        int oddIndex = nums.length - 1;
        while(evenIndex < oddIndex){
            while(evenIndex < oddIndex && nums[evenIndex]%2 == 0){
                evenIndex++;
            }
            while(evenIndex < oddIndex && nums[oddIndex]%2 == 1){
                oddIndex--;
            }
            if(evenIndex < oddIndex){
                int temp = nums[evenIndex];
                nums[evenIndex] = nums[oddIndex];
                nums[oddIndex] = temp;
            }
        }
        return nums;
    }
}