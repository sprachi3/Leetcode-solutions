class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid=new String[m];
        char[] row=new char[n];

        for(int i=0;i<n;i++){
            row[i]='#';
        }

        for(int i=0;i<m;i++){
            grid[i]=new String(row);
        }

        char[] first=grid[0].toCharArray();
        for(int i=0;i<n;i++){
            first[i]='.';
        }

        grid[0]=new String(first);

        for(int i=0;i<m;i++){
            char[] r=grid[i].toCharArray();
            r[n-1]='.';
            grid[i]=new String(r);
        }

        return grid;
        
    }
}