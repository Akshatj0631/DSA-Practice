class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int nums3[]= new int[n+m];
        int k=0,i=0,j=0;
        while(i<n && j<m )
        {
            if(nums1[i]<=nums2[j])
            {
                nums3[k++]=nums1[i++];
            }
            else
            nums3[k++]=nums2[j++];
        }  
        while(i<n)
           nums3[k++]=nums1[i++];
        while(j<m)
           nums3[k++]=nums2[j++];
        if((m+n)%2!=0)
        return nums3[(m+n)/2];
            int idx=((m+n)/2)-1;
            int idx2=(m+n)/2;
            return (double)(nums3[idx]+nums3[idx2])/2.0;

    }
}