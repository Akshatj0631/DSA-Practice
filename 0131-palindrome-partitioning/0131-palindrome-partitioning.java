class Solution {
    boolean isPalindrome(String s,int l,int r)
    {
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;r--;
        }
        return true;
    }
    void backtrack(String s,int idx,List<String> curr,List<List<String>> res)
    {
        if(idx==s.length()) 
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx;i<s.length();i++)
        {
            if(isPalindrome(s,idx,i))
            {
                curr.add(s.substring(idx,i+1));
                backtrack(s,i+1,curr,res);
                curr.remove(curr.size()-1);
            }
        }

    }
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> curr=new ArrayList<>();
        backtrack(s,0,curr,res);
        return res;
        
    }
}