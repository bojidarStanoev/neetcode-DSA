class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [ ] res = new int[2];
        HashMap<Integer,Integer> checker = new HashMap<>(); 
        for (int i=0;i<nums.length;i++){
             if( checker.get(target -nums[i]) !=null ){
                res[1]=i;res[0]=checker.get(target -nums[i]);
             }else{
                checker.put(nums[i],i);
             }
        }


        return res;
    }
}
