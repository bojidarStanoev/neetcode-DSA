class Solution {
    public boolean isPalindrome(String s) {
        
        char [] arr = s.toLowerCase().toCharArray();

        for(int i=0,c=arr.length-1;i<c;i++,c--){
            while(((arr[i]<'a' || arr[i]>'z') && (arr[i] < '0' || arr[i] >'9' )) && i<c){
                i++;
            }
            while(((arr[c]<'a' || arr[c]>'z') && (arr[c] < '0' || arr[c] >'9') ) && i<c){
                c--;
            }
            if( arr[i] != arr[c]){
                    return false;
            }
        }
        return true;
    }
}
