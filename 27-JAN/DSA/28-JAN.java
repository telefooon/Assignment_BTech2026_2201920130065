//Count number of islands
class Solution {
    public int numIslands(char[][] grid) {
        int res = 0;
        HashSet<String> visit = new HashSet<>();

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                String key = i + "," + j; 
                if(grid[i][j] == '1' && !visit.contains(key)){
                    res++;
                    dfs(i, j, grid, visit);
                }
            }
        }
        return res;
    }
    public void dfs(int i, int j, char[][] grid, HashSet<String> visit){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0'){
            return;
        }

        String key = i + "," + j;

        if(visit.contains(key)){
            return;
        }

        visit.add(key);
        dfs(i + 1, j, grid, visit);
        dfs(i - 1, j, grid, visit);
        dfs(i, j + 1, grid, visit);
        dfs(i, j - 1, grid, visit);
    }
}

//UNIQUE PATHS
class Solution {
    public int uniquePaths(int m, int n) {
        int mat[][] = new int[m][n];
        for(int i = 0; i < m; i++){
            mat[i][0] = 1;
        }

        for(int j = 0; j < n; j++){
            mat[0][j] = 1;
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                int up = mat[i - 1][j];
                int left = mat[i][j - 1];

                mat[i][j] = (up + left);
            }
        }

    return mat[m - 1][n - 1];
    }
}
