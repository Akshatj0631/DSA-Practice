class Solution {
     private Set<List<Integer>> result = new HashSet<>();
        private void solve(int[] nums, int idx, List<Integer> temp) {
        if (idx >= nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        solve(nums, idx + 1, temp);
        temp.remove(temp.size() - 1);
        solve(nums, idx + 1, temp);
}
    public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);  // Add this line
          List<Integer> temp = new ArrayList<>();
        solve(nums, 0, temp);
        List<List<Integer>> ans=new ArrayList<>();
        for(List<Integer> res:result)
        {
            ans.add(res);
        }
        return ans;
    }
}
