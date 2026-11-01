class Solution {
    public boolean isConsecutive(int[] nums) {
        if(nums.length == 1 || nums.length==0){
            return true;
        }
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-1;i++){

            if(nums[i]!=nums[i+1]-1){
                return false;
            }
        }
        return true;
    }
}
