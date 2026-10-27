class Solution {
    public int maxNumberOfApples(int[] weight) {
        Arrays.sort(weight);
        int res=0;int sum=0;
        for(int i=0;i<weight.length;i++){
            sum=sum+weight[i];
            if(sum>5000){
               res=i; break;
            }
            else{res=i+1;}
        }
        return res;
    }
}
