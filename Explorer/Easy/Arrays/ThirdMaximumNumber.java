class Solution {
    public int thirdMax(int[] nums) {
        
        Integer max = null;
        Integer second_max = null;
        Integer third_max = null;

        
        for(Integer i : nums){
            if(i.equals(max) || i.equals(second_max) || i.equals(third_max)){
                continue;
            }
                if(max == null || i > max){
                    third_max = second_max;
                    second_max = max;
                    max = i;
                }else if (second_max == null || i > second_max){
                    third_max = second_max;
                    second_max = i;
                }else if(third_max == null || i > third_max){
                    third_max = i;
                }
        }
        if(third_max == null){
            return max;
        }
         return third_max;
        
    }
}