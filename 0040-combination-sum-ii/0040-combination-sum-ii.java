class Solution {
    List<List<Integer>> res= new ArrayList<>();
    void backtrack(int ind,List<Integer>temp,int remain,int arr[])
    {
        if(remain==0)
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        else if(remain<0) return;
        //skip
        if(ind==arr.length)return;
        int next = ind + 1;
        while (next < arr.length && arr[next] == arr[ind]) {
            next++;
        }
        backtrack(next, temp, remain, arr);
        if(arr[ind]<=remain)
        {
            temp.add(arr[ind]);
            backtrack(ind+1,temp,remain-arr[ind],arr);
            temp.remove(temp.size()-1);
        }
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(0,new ArrayList<>(),target,candidates);
        return res;
    }
}