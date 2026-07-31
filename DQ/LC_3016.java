class LC_3016 {
    public int minimumPushes(String word) {
        int n=word.length();
        HashMap<Character,Integer> hash=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char ch=word.charAt(i);
            hash.put(ch,hash.getOrDefault(ch,0)+1);
        }
        List <Integer> freq=new ArrayList<>(hash.values());
        freq.sort(Collections.reverseOrder());
        int ans=0;
        for(int i=0;i<freq.size();i++)
        {
            ans+=freq.get(i)*(i/8+1);//Integer Division
        }
        return ans;
    }
}