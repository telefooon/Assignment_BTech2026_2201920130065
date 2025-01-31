//BRUTE FORCE
class Solution {
    public int largestIsland(int[][] grid) {
        int n = grid.length;
        int maxare = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 0){
                    grid[i][j] = 1;

                    int maxland = 0;
                    HashSet<String> visit = new HashSet<>();
                    for(int x = 0; x < n; x++){
                        for(int y = 0; y < n; y++){
                            if(grid[x][y] == 1 && !visit.contains(x + "," + y));
                            maxland = Math.max(maxland, dfs(x, y, grid, visit));
                        }
                    }
                    maxare = Math.max(maxare, maxland);
                    grid[i][j] = 0;
                }
            }
        }
        return maxare == 0? n * n : maxare;
    }

    public int dfs(int i, int j, int grid[][], HashSet<String> visit){
        int n = grid.length;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        if(i < 0 || j < 0 || i >= n || j >= n || grid[i][j] == 0 || visit.contains(i + "," + j)){
            return 0;
        }
        String key = i + "," + j;
        visit.add(key);

        int count = 1;

        for (int[] dir : directions) {
            int i_ = i + dir[0];
            int j_ = j + dir[1];
            count += dfs(i_, j_, grid, visit);
        }

        return count;
    }
}


//OPTIMAL APPROACH
import java.util.*;

class Solution {
    public int largestIsland(int[][] grid) {
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int n = grid.length;
        int id = 2;  // Start marking islands from 2
        int maxArea = 0;
        Map<Integer, Integer> islandSize = new HashMap<>();

        // Step 1: Mark islands with unique ids and store their sizes
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int size = dfs(i, j, grid, id);
                    islandSize.put(id, size);
                    maxArea = Math.max(maxArea, size);
                    id++;  // Increment only after marking an island
                }
            }
        }

        // Step 2: Try flipping each 0 to 1 and calculate the new max area
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    Set<Integer> visitedIslands = new HashSet<>();
                    int newSize = 1;  // The flipped 0 becomes 1

                    for (int[] dir : directions) {
                        int x = i + dir[0];
                        int y = j + dir[1];

                        if (x >= 0 && y >= 0 && x < n && y < n && grid[x][y] != 0) {
                            int islandId = grid[x][y];
                            if (!visitedIslands.contains(islandId)) {
                                newSize += islandSize.get(islandId);
                                visitedIslands.add(islandId);
                            }
                        }
                    }

                    maxArea = Math.max(maxArea, newSize);
                }
            }
        }

        return maxArea;
    }

    // DFS to mark the island and count its size
    private int dfs(int i, int j, int[][] grid, int id) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid.length || grid[i][j] != 1) {
            return 0;
        }

        grid[i][j] = id;
        int size = 1;

        size += dfs(i + 1, j, grid, id);
        size += dfs(i - 1, j, grid, id);
        size += dfs(i, j + 1, grid, id);
        size += dfs(i, j - 1, grid, id);

        return size;
    }
}
