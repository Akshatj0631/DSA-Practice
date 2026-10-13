class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        int i=0,j=n-1;
        long s=0;
        while(i<j)
        {
            s+=nums[j];
            j--;
            s-=nums[i];
            i++;
        }
        if(n%2!=0)
        {
            s=Math.max(s+nums[i],s-nums[i]);
        }
        return s;
    }
}