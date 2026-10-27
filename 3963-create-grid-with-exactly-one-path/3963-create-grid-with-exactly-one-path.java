class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid=new String[m];
        char ch[]=new char[n];
        for(int i=0;i<n;i++)
        ch[i]='#';
        String s=new String(ch);
        Arrays.fill(grid,s);
        grid[0]=".".repeat(n);
        // Make the last column a dot
for (int i = 0; i < m; i++) {
    grid[i] = grid[i].substring(0, n - 1) + ".";
}
return grid;
    }
}