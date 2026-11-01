class Solution {
    public int[] getConcatenation(int[] nums) {
        int res [] = new int[nums.length*2];




        for(int i=0, c = nums.length;i<nums.length;i++,c++){
            res[i]=nums[i];
            res[c]=nums[i];
        }
        return res;
    }
}