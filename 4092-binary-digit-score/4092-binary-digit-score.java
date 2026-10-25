class Solution {
    String intToBinary(int n)
    {
        StringBuilder ans=new StringBuilder();
        while(n!=0)
        {
            ans=ans.append(n%2);
            n/=2;
        }
        return ans.reverse().toString();
    }
    public int calculateScore(int a, int b) {
        String s1=intToBinary(a);
        String s2=intToBinary(b);
        int s1_one=0,s2_one=0;
        for(char c:s1.toCharArray())
        {
            if(c=='1')
        s1_one++;
    }
      for(char c:s2.toCharArray())
        {
            if(c=='1')
        s2_one++;
    }
    if(s1_one>=s2_one)
    return s1_one*s2_one;
return s2_one/s1_one;
}
}