class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> dups = new HashMap<>();
        for( int i : nums){

            if(dups.get(i)==null){
                dups.put(i,1);
            }
            else{
                return true;
            }
        }
        return false;
    }
}