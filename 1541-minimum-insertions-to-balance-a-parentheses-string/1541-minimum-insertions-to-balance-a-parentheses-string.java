class Solution {
    public int minInsertions(String s) {
        int count=0;
        int result=0;int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='('){
                    count++;
                }
                else{
                    if(count>0) count--;
                    else result++;
                    if(i+1<n &&s.charAt(i+1)==')')
                    {
                        i+=1;
                    }
                    else{
                        result++;
                    }
                }
            }
            return result+(count*2);
        
    }
}