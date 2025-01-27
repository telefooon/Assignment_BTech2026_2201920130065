class Solution {
    public int islandPerimeter(int[][] grid) {
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    HashSet<String> visit = new HashSet<>();
                    return dfs(i, j, grid, visit);
                }
            }
        }
        return 0;
    }
    public int dfs(int i, int j, int grid[][], HashSet<String> visit){
        int res = 0;
        if(i >= grid.length || j >= grid[0].length ||  i < 0 || j < 0 || grid[i][j] == 0){
            return 1;
        }

        String key = i + "," + j;
        if (visit.contains(key)) {
            return 0;
        }
        visit.add(key);

        res += dfs(i + 1, j, grid, visit);
        res += dfs(i - 1, j, grid, visit);
        res += dfs(i, j + 1, grid, visit);
        res += dfs(i, j - 1, grid, visit);

        return res;
    }
}