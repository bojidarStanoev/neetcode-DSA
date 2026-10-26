class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(hm.get(target-numbers[i])!=null)
            {   int arr [] ={hm.get(target-numbers[i])+1,i+1};
                return arr;
            }else{
            hm.put(numbers[i],i);}
        }
        return null;
    }
}
