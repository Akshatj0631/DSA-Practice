class Solution {
    List<List<Integer>> res = new ArrayList<>();

    void backtrack(List<Integer> temp, int nums[], boolean[] used) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            temp.add(nums[i]);
            used[i] = true;

            backtrack(temp, nums, used);

            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        backtrack(new ArrayList<>(), nums, new boolean[nums.length]);
        return res;
    }
}