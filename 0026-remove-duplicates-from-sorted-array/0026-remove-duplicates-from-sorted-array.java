class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> ss=new TreeSet<>();
        for(int x:nums)
        {
            ss.add(x);
        }
        int i=0;
        for(int x:ss)
        {
            nums[i++]=x;
        }
        return ss.size();
    }
}