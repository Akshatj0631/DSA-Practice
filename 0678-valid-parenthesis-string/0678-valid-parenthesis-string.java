class Solution {
    public boolean checkValidString(String s) {
        int n=s.length();
        boolean t[][]= new boolean[n+1][n+1];
        t[n][0]=true;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {
                boolean isvalid=false;
                if(s.charAt(i)=='*')
                {
                    isvalid|=t[i+1][j+1];
                    isvalid|=t[i+1][j];
                    if(j>0)
                    isvalid|=t[i+1][j-1];
                }
                else if(s.charAt(i)=='(')
                {
                isvalid|=t[i+1][j+1];
                }                
                else if(j>0)
                {
                    isvalid|=t[i+1][j-1];
                }
                t[i][j]=isvalid;
            }
        }
        return t[0][0];
    }
}