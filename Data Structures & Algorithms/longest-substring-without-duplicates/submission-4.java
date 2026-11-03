class Solution {
    public int lengthOfLongestSubstring(String s) {
            HashSet<Character> c = new HashSet<>();
            int res=0;
            for(int l=0, r=0;r<s.length();r++){

                while(c.contains(s.charAt(r))){
                    c.remove(s.charAt(l));l++;
                    
                }
                
                c.add(s.charAt(r));
                if(res<r-l+1){res=r-l+1;}
            }
            return res;
    }
}
