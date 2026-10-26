class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
          HashMap<Character, Integer> tMap = new HashMap<>();
        
        
        for (char c : s.toCharArray()){
            if(sMap.get(c)==null){
                sMap.put(c,1);
            }else{
                 sMap.put(c,sMap.get(c)+1);
            }
        }
        for (char c : t.toCharArray()){
            if(tMap.get(c)==null){
                tMap.put(c,1);
            }else{
                 tMap.put(c,tMap.get(c)+1);
            }
        }
        if(tMap.size() != sMap.size()){
            return false;
        }
        for (char c : s.toCharArray()){
            if(tMap.get(c)==null){
                return false;
            }else{
                if(!tMap.get(c).equals(sMap.get(c)))
                {return false;}
            }
        }
        

        return true;

    }
}
