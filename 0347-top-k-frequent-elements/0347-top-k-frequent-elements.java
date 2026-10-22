class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count=new HashMap<>();
        for(int n:nums)
        count.put(n,count.getOrDefault(n,0)+1);
        List<Integer> element=new ArrayList<>(count.keySet());
        element.sort((a,b)->count.get(b)-count.get(a));
        int [] result=new int[k];
        for(int i=0;i<k;i++)
        {
            result[i]=element.get(i);
        }
        return result;
    }
}