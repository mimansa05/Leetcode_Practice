class Solution {
    public List<String> letterCombinations(String digits) {
     String[] map = {"","","abc", "def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans=new ArrayList<>();
        solve(0,digits,new StringBuilder(),ans,map);
        return ans;
    }
    void solve(int ind,String digits,StringBuilder temp,List<String> ans,String[] map)
    {
        if(temp.length()==digits.length())
        {
            ans.add(temp.toString());
            return;
        }
        int d=digits.charAt(ind)-'0';
        String letters=map[d];
        for(char x:letters.toCharArray())
        {
            temp.append(x);
            solve(ind+1,digits,temp,ans,map);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}