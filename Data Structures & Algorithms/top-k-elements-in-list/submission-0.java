class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int [] res= new int[k];
        for ( int i: nums){
            if(map.get(i) !=null){
                map.put(i,map.get(i) +1);
            }
            else{
                map.put(i,1);
            }
        }
        int counter=0;
        List<Integer> keyset = new ArrayList<>(map.keySet());
        keyset.sort( (a,b) -> map.get(b)-map.get(a));
     
        for (int i=0;i<k;i++,counter++){
            res[counter]=keyset.get(i);
        }

        return res;
    }
}
