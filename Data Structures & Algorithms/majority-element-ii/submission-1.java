class Solution {
    public List<Integer> majorityElement(int[] nums) {
            int majority=nums.length/3;
            HashMap<Integer,Integer> map = new HashMap<>();
            Set<Integer> res = new HashSet<>();
            for(int i : nums){
                
                if(map.get(i) == null){
                    map.put(i, 1);
                }else{
                    map.merge(i, 1, (oldVal, newVal) -> oldVal+newVal);
                   
                }
                 if(map.get(i)>majority){
                        res.add(i);
                    }
            }

        return List.copyOf(res);
    }
}