class Solution {
    //simple math used
    public String getPermutation(int n, int k) {
        List<Integer> number=new ArrayList<>();
        int fact=1;
        for(int i=1;i<n;i++)
        {
            fact*=i;
            number.add(i);
        }
        number.add(n);
        String ans="";
        k-=1;
        while(true)
        {
            ans+=number.get(k/fact);
            number.remove(k/fact);
            if(number.size()==0)
            break;
            k%=fact;
            fact=fact/number.size();
        }
        return ans;
    }
}