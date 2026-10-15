class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int content=0,child=0;
        for(int i=0;i<s.length;i++)
        {
            if(g[child]<=s[i])
            {
                i++;
                child++;
                content++;
            }
        }
        return content;
            }
}