class Solution {
    public int[] rearrangeArray(int[] nums) {
     int res[]= new int[nums.length];
     int freq[]= new int[101];
     int maxfreq=0;
     for(int x:nums)
     {
        freq[x]++;
        maxfreq=maxfreq<freq[x]?freq[x]:maxfreq;
     }   
     int x=0;
     for(int round=0;round<maxfreq;round++)
     {
        for(int i=1;i<101;i++)
        {
            if(freq[i]>0)
            {
                res[x++]=i;
                freq[i]--;
            }
        }
     }
     return res;
    }
}