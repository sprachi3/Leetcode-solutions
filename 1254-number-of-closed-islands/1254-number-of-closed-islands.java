class Solution {
    public int closedIsland(int[][] grid) {
        int c=0;
        int n=grid.length;
        int m=grid[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                if(dfs(grid,i,j)) {
                    c++;
                }
            }}
        }
        return c;
        
    }

    private boolean dfs(int[][] grid,int i,int j){
        int n=grid.length;
        int m=grid[0].length;

        if(i<0||i>=n||j<0||j>=m) return false;

        if(grid[i][j]==1) return true;

        grid[i][j]=1;

        boolean up=dfs(grid,i-1,j);
        boolean down=dfs(grid,i+1,j);
        boolean left=dfs(grid,i,j-1);   
        boolean right=dfs(grid,i,j+1);

        return up && down && left && right;
    }
}