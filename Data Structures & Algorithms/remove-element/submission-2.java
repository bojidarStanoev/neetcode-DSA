class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 1){
            if(nums[0] == val){
                return 0;
            }
        }
        int counter=nums.length;
        for(int i=0,c=nums.length-1;i<=c;i++){

            if(nums[i] == val){
                while( i<c && nums[c] == val){
                    c--;counter--;
                }
                int temp=nums[c];
                nums[c] = nums[i];
                nums[i] = temp;
                c--;
                counter--;
            }
                
            
        }
        return counter;
    }
}