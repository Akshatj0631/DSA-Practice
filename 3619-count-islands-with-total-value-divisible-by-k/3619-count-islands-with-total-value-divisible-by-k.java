class Solution {
    public int countIslands(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int ans=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               if(grid[i][j]!=0)
               {
                Long s=dfs(grid,i,j);
                if(s%k==0) ans++;
               }
            }
        }
        return ans;
    }

    long dfs(int grid[][],int i,int j)
    {
        if(i<0 || j<0||i>=grid.length||j>=grid[0].length||grid[i][j]==0) return 0;
       Long sum=(long)grid[i][j];
       grid[i][j]=0;
       sum+=dfs(grid,i+1,j);
        sum+=dfs(grid,i-1,j); 
        sum+=dfs(grid,i,j-1); 
        sum+=dfs(grid,i,j+1);
        return sum;
    }
}