class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i=0,c=numbers.length-1;i<c;){
            if(numbers[c]  >target - numbers[i]  && i<c){
                c--;
            }
           if(numbers[i] <target - numbers[c]  && i<c){
                i++;
            }
            if(numbers[c] + numbers[i] == target){
                int [] res={i+1,c+1};
               return res;
            }
            
        }
        return null;
    }
}
