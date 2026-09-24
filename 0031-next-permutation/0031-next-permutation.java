class Solution {
    void reverse(int nums[],int i)
    {
        int n=nums.length-1;
        while(i<n)
        {
            nums[i]=nums[i]+nums[n];
            nums[n]=nums[i]-nums[n];
            nums[i]=nums[i]-nums[n];
            i++;
            n--;
        }
    }
    public void nextPermutation(int[] nums) {
     int flag=-1;
     int ind=-1;
     for(int i=nums.length-2;i>=0;i--)
     {
        if(nums[i]<nums[i+1])
        {
            ind=i;
            break;
        }
     }   
     if(ind==-1){
        reverse(nums,0);
     }
     else{
     int ind2=-1;
      for(int i=nums.length-1;i>ind;i--)
     {
        if(nums[ind]<nums[i])
        {
            ind2=i;
            break;
        }
     }
     nums[ind]=nums[ind]+nums[ind2];
     nums[ind2]=nums[ind]-nums[ind2];
     nums[ind]=nums[ind]-nums[ind2];
     reverse(nums,ind+1);
    } 
}
}