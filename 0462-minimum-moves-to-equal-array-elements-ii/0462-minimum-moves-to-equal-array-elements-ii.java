class Solution {
    public int minMoves2(int[] nums) {
        int median,n=nums.length;
        Arrays.sort(nums);
        if(n%2==0)
        {
            int x1=nums[n/2];
            int x2=nums[(n/2)-1];
            median=(x1+x2)/2;
        }
        else median=nums[n/2];
        int s=0;
        for(int x:nums)
        {
        if(x<=median) s+=median-x;
        else s+=x-median;
        }
        return s;

    }
}