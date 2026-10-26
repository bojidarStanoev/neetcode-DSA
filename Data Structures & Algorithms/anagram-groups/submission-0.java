class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String,List<String>> map = new HashMap<>();
      List<List<String>> res = new ArrayList<>();
        
      for(String s: strs){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        if(map.get(sorted) != null){
            List<String> l = map.get(sorted);
            l.add(s);
        }
        else{
            List<String> l = new ArrayList<>();
            l.add(s);
            map.put(sorted,l);
        }
      }
        for(List<String> ks: map.values()){

            res.add(ks);
        }
        return res;
    }
}
