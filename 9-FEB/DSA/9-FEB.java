//CONTIGUOUS ARRAY
class Solution {
    public int findMaxLength(int[] nums) {
        int res = 0;
        int one = 0;
        int zero = 0;

        HashMap<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zero++;
            }

            if(nums[i] == 1){
                one++;
            }

            int diff = one - zero;

            if(!count.containsKey(diff)){
                count.put(diff, i);
            }

            if(one == zero){
                res = one + zero;
            }
            else{
            int idx = count.get(diff);
            res = Math.max(res, i - idx);
            }
        }

        return res;
    }
}


// COUNT SUB ISLANDS
class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        Set<String> visit = new HashSet<>();
        int res = 0;

        for(int i = 0; i < grid2.length; i++){
            for(int j = 0; j < grid2[0].length; j++){
                if(grid2[i][j] == 1 && !visit.contains(i + "," + j)){
                    if(dfs(grid1, grid2, i, j, visit)){
                        res++;
                    }
                }
            }
        }

        return res;
    }

    public boolean dfs(int[][] grid1, int [][] grid2, int i, int j, Set<String> visit){
        if(i < 0 || j < 0 || i >= grid2.length || j >= grid2[0].length || grid2[i][j] == 0 || visit.contains(i + "," + j)){
            return true;
        }

        boolean res = true;
        if(grid1[i][j] == 0){
            res = false;
        }

        res = dfs(grid1, grid2, i + 1, j, visit) && res;
        res = dfs(grid1, grid2, i - 1, j, visit) && res;
        res = dfs(grid1, grid2, i, j + 1, visit) && res;
        res = dfs(grid1, grid2, i, j - 1, visit) && res;

        return res;
        

    }
}

//COUNT CLOSED ISLANDS
class Solution {
    public int closedIsland(int[][] grid) {
        Set<String> visit = new HashSet<>();
        int res = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 0 && !visit.contains(i + "," + j)){
                   if (dfs(grid, i, j, visit)) {
                        res++;
                    }
                    }
                }
            }
            return res;
        }

    public boolean dfs(int [][] grid, int i, int j, Set<String> visit){
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return false; 
        }
        if (grid[i][j] == 1 || visit.contains(i + "," + j)) {
            return true; 
        }

        visit.add(i + "," + j);

        boolean up = dfs(grid, i - 1, j, visit);
        boolean down = dfs(grid, i + 1, j, visit);
        boolean left = dfs(grid, i, j - 1, visit);
        boolean right = dfs(grid, i, j + 1, visit);

        return up && down && left && right; 
    }
}