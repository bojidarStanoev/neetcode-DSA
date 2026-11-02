class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> counter=new HashMap<>();


        for(int i: nums){
            if(counter.get(i) == null){
                counter.put(i, 1);
            }else{
                counter.merge(i, counter.get(i), (oldVal, newVal) -> oldVal+1);
            }

            if(counter.get(i)>nums.length/2){return i;}
        }
        return nums[0];
    }
}