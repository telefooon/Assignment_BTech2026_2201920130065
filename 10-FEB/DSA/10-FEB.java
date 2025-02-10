//SURROUNDED REGIONS
class Solution {
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == 'O' && ((i == 0 || i == n - 1) || (j == 0 || j == m - 1))){
                    dfs(i, j, board);
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }

                if(board[i][j] == 'T'){
                    board[i][j] = 'O';
                }
            }
        }
    }

    public void dfs(int i, int j, char[][] board){
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != 'O'){
            return;
        }

        board[i][j] = 'T';
        dfs(i + 1, j, board);
        dfs(i - 1, j, board);
        dfs(i, j + 1, board);
        dfs(i, j - 1, board);
    }
}