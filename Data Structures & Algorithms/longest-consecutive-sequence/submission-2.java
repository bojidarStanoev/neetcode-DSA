class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0){
            return 0;
        }
        Arrays.sort(nums);
        int length=1;
        int maxLenght=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]){
                length++;
            }else if(nums[i]==nums[i+1]){
                continue;
            }
            else{
                if(length>=maxLenght){
                    maxLenght=length;
                }
                length=1;
            }

        }
        if(length>=maxLenght){
                    maxLenght=length;
                }
        //2,3,4,4,5,10,20
        //-1,-1,0,
        return maxLenght;
    }
}
