class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,max=0;
        for(int x:nums)
        {
            if(x==0) c=0;
            else
            {
                c++;
                max=max<c?c:max;
            }
        }
        return max;
    }
}