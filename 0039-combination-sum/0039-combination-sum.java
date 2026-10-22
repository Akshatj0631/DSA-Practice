class Solution {
    public List<List<Integer>> ls= new ArrayList<>();
    void backtrack(int[] arr,List<Integer> temp,int ind,int remain)
    {
        if(remain<0) return;
        if(remain==0){
            ls.add(new ArrayList<>(temp));
/*
Remember this for backtracking!
* ls.add(temp) → Stores the same list reference.
* ls.add(new ArrayList<>(temp)) → Stores a separate copy of the list.
*/
            return;
        }
        for(int i=ind;i<arr.length;i++)
        {
            temp.add(arr[i]);
            backtrack(arr,temp,i,remain-arr[i]);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates,new ArrayList<>(),0,target);
        return ls;
    }
}