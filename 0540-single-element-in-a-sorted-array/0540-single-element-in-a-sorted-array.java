class Solution {
    public int singleNonDuplicate(int[] nums) {
        int a=0;
        for(int x:nums)
        a=a^x;
        return a;
    }
}