class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];

        for(int i=0;i<strs[0].length();i++){
            String s = strs[0];

            for(int c=0;c<strs.length;c++){
                if(strs[c].length()==i || strs[c].charAt(i) != s.charAt(i)){
                    return s.substring(0, i);
                }
            }

        }

        return prefix;
    }
}