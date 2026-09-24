class Solution {
    public int maxSubArray(int[] nums) {
        int total=nums[0],res=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            total=Math.max(total+nums[i],nums[i]);
            res=Math.max(res,total);
        }
        return res;
    }
}