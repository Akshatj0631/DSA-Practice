class Solution {
    int isvalid[][]=new int[101][101];
    boolean solve(String s, int i,int open)
    {
        if(isvalid[i][open]!=-1) return isvalid[i][open]==1?true:false;
        if(i>=s.length()) return open==0;
        boolean res=false;
        if(s.charAt(i)=='(')
        res|=solve(s,i+1,open+1);
        else if(s.charAt(i)==')' && open>0)
        res|=solve(s,i+1,open-1);
        else if(s.charAt(i)=='*')
        { 
        res|=solve(s,i+1,open+1)||solve(s,i+1,open);
        if(open>0)
        res|=solve(s,i+1,open-1);
    }
    if(res==true)isvalid[i][open]=1;
    else isvalid[i][open]=0;
    return res;
    }
    public boolean checkValidString(String s) {
       for(int x[]:isvalid)
       Arrays.fill(x,-1);
        return solve(s,0,0);
    }
}