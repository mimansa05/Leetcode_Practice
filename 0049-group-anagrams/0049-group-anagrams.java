class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Key---> sorted strings , Value---> List containing strings
        /*s
          ↓
    toCharArray()
          ↓
    Arrays.sort()
          ↓
    new String()
          ↓
       key*/
        HashMap<String,List<String>> hash=new HashMap<>();
        for(String s: strs)
        {
            char c[]=s.toCharArray();
            Arrays.sort(c);
            String key=new String(c);
            if(!hash.containsKey(key))
            {
                hash.put(key,new ArrayList<>());
            }
            hash.get(key).add(s);
        }
        return new ArrayList<>(hash.values());
    }
}