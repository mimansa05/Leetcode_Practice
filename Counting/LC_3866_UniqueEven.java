class LC_3866_UniqueEven {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int x:nums)
        {
            if(x%2==0)
            {
                hash.put(x,hash.getOrDefault(x,0)+1);
            }
        }
        for(int x:nums)
        {
            if(x%2==0 && hash.get(x)==1) return x;
        }
        return -1;
    }
}